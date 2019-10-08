package practica1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookTest {
	@Test
	void test() {
		Book myBook = new Book("The Lord of the Rings", "J. R. R. Tolkien", 9788373191723L, 20, 20);
		assertEquals("The Lord of the Rings", "J. R. R. Tolkien");
	}

}



