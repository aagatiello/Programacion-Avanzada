package practicaJava;

import junit.framework.TestCase;

public class BooksTest extends TestCase {
	void test() {
		Books myBook = new Books("The Lord of the Rings", "J. R. R. Tolkien", 9788373191723L, 20, 20);
		assertEquals("The Lord of the Rings", myBook.getTitle());
	}
}

