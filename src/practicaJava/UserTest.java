package practicaJava;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	void test() {
		User myUser = new User("Agustina", "Agatiello", "12345A", "Contraseña");
		assertEquals("Contraseña", myUser.getPassword());
	}
}
