package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		// without stream api
		List<Product> list = new ArrayList<Product>();
		for(Product product: getProducts()) {
			if(product.getPrice() > 2000) {
				list.add(product);
			}
		}
		for(Product product: list) {
			System.out.println(product);
		}
		
		// using stream api
		System.out.println("\nUsing Stream API");
		getProducts().stream().filter(product -> product.getPrice() > 2000)
							.collect(Collectors.toList())
							.forEach(System.out::println);

	}
	
	private static List<Product> getProducts(){
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Macbook Air", 120000));
		products.add(new Product(2, "Wipro T-Shirt", 1200));
		products.add(new Product(3, "Boat Rockerz 400", 1500));
		products.add(new Product(4, "STM Laptop Bag", 3000));
		products.add(new Product(5, "Campus Air Shoes", 1800));
		
		return products;	
	}

}
class Product {
	private int id;
	private String name;
	private float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
