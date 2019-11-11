package org.practica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() {
		User myUser = new User("Agustina", "Agatiello", "12345A", "hola");
		assertEquals("hola", myUser.getPassword());
	}
}
