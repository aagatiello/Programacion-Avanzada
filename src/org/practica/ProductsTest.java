package org.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductsTest {

	@Test
	final void testGetAuthor() {
		Products myBook = new Books("Dream of the Red Chamber", "Cao Xueqin", 9787534243752L, 5, 5);
		assertEquals("Cao Xueqin", myBook.getAuthor());
	}

	@Test
	final void testIsAvailable() {
		Products myMovie = new Movies("E.T. The Extra-Terrestrial", "Steven Spielberg", 1982, 5, 5);
		assertEquals(true , myMovie.isAvailable());
	}

}
