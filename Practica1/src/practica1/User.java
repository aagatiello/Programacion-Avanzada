package practica1;

public class User {

	String firstname;
	String lastname;
	String id;

	public User(String firstname, String lastname, String id) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributes() {
		return "Name: " + this.firstname + "\t Surname: " + this.lastname + "\t ID: " + this.id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
