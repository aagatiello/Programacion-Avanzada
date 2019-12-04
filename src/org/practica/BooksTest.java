package org.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BooksTest {

	@Test
	final void test() {
		Books myBook = new Books("The Lord of the Rings", "J. R. R. Tolkien", 9788373191723L, 20, 20);
		assertEquals("The Lord of the Rings", myBook.getTitle());
	}

}
