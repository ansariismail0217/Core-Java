package com.java.collections.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(30);
//		list.add(20);
//		list.add(50);
//		list.add(40);
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
		
		List<Employee> employees  = new ArrayList<Employee>();
		employees.add(new Employee(10, "Abdullah", 24, 37000));
		employees.add(new Employee(20, "Ismail", 25, 45000));
		employees.add(new Employee(30, "Ansari", 24, 41000));
		employees.add(new Employee(40, "Ramesh", 30, 400000));
		
		System.out.println("Sorting by salary:");
		
//		Collections.sort(employees, new MySort()); // ascending order by salary
//		System.out.println(employees);
//		
//		Collections.sort(employees, new MySortDescending()); //descending order by salary
//		System.out.println(employees);
		
		//implementing comparator as anonymous function
		System.out.println("Using anonymous function:");
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary()); //for descending sort, o1 and o2.
			}
			
		});
		System.out.println(employees);
		
		//sorting collections using lambda function
		//for descending sort, o1 and o2.
		Collections.sort(employees, (o1,o2) -> (int)(o1.getSalary() - o2.getSalary()));
		System.out.println("Using lambda function");
		System.out.println(employees);
		
		System.out.println("\nSorting by name:");
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (o2.getName().compareTo(o1.getName()));  //desc order
			}
		});
		System.out.println("Using anonymous function:");
		System.out.println(employees);
		
		Collections.sort(employees, (o1,o2) -> o2.getName().compareTo(o1.getName()));
		System.out.println("Using lambda function:");
		System.out.println(employees);
		
	}

}

class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}
	
}

class MySortDescending implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
}
