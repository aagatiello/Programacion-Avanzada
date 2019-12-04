package org.practica;

import java.util.ArrayList;

public class User implements InterfaceUser {

	// Creational pattern applied (Builder)

	public static class UserBuilder {

		private String id;
		private String name;
		private String password;
		private String surname;

		public UserBuilder(String name, String surname, String id, String password) {
			this.name = name;
			this.surname = surname;
			this.id = id;
			this.password = password;
		}

		public User build() {
			User user = new User(this);
			return new User(this);
		}
	}

	static User actualUser;
	
	private String id;
	private String name;
	private String password;
	private String surname;
	
	public User(UserBuilder user) {
		this.name = user.name;
		this.surname = user.surname;
		this.id = user.id;
		this.password = user.password;
	}

	public static boolean authentification(String id, String password, ArrayList<User> Ulist) {
		boolean login = false;

		for(int i = 0; i < Ulist.size(); i++) {
			if(id.equals(Ulist.get(i).getId()) && password.equals(Ulist.get(i).getPassword())) {
				login = true;
				actualUser = Ulist.get(i);
			}
		}
		return login;
	}

	public String getAttributes() {
		return "Name: " + this.name + "\t Surname: " + this.surname + "\t ID: " + this.id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getSurname() {
		return surname;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
