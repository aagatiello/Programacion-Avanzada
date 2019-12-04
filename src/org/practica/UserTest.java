package org.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.practica.User.UserBuilder;

class UserTest {

	@Test
	final void test() {
		UserBuilder myUserBuilder = new UserBuilder("Agustina", "Agatiello", "12345A", "hola");
		User myUser = new User(myUserBuilder);
		assertEquals("hola", myUser.getPassword());
	}
	
}
