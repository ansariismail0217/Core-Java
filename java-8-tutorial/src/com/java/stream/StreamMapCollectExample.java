package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
	
	public static void main(String[] args) {
	
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Abdullah", "abdullah@gmail.com", "abdullah123"));
		users.add(new User(2, "Ismail", "ismail@gmail.com", "ismail123"));
		users.add(new User(3, "Ansari", "ansari@gmail.com", "ansari123"));
		
		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		//traditional way
		for(User user: users) {
			usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		for(UserDTO dto : usersDTO) {
			System.out.println(dto);
		}
		
		System.out.println("\nUsing stream API");
		//using stream API => stream().map()
		users.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
			}
		}).forEach(System.out::println);
		
		//using stream with lambda
		System.out.println("\nUsing stream API with lambda");
		users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), 
				user.getEmail())).forEach(System.out::println);
		
		//using stream api with collectors to convert stream back to list and send back to client
		System.out.println("\nUsing stream API with collectors "
				+ "\nto convert stream back to list and send back to client");
		List<UserDTO> usersDTO2 = users.stream().map((User user) -> new UserDTO(user.getId(), 
				user.getUserName(), user.getEmail())).collect(Collectors.toList());
		usersDTO2.forEach(System.out::println);
		
	}

}

class UserDTO{
	private int id;
	private String userName;
	private String email;
	
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
}

class User{
	private int id;
	private String userName;
	private String email;
	private String password;
	
	public User(int id, String userName, String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	
}
