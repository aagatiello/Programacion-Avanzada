package org.practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoviesTest {

	@Test
	void test() {
		Movies myMovie = new Movies("The Godfather", "Francis Ford Coppola", 1972, 20, 20);
		assertEquals("Francis Ford Coppola", myMovie.getAuthor());
	}

}
