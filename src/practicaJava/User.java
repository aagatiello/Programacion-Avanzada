package practicaJava;

public class User {

	String name;
	String surname;
	String id;
	String password;

	public User(String name, String surname, String id, String password) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAttributes() {
		return "Name: " + this.name + "\t Surname: " + this.surname + "\t ID: " + this.id;
	}
}
