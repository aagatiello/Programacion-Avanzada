package org.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MoviesTest {

	@Test
	final void test() {
		Movies myMovie = new Movies("The Godfather", "Francis Ford Coppola", 1972, 20, 20);
		assertEquals(1972 , myMovie.getYearReleased());
	}

}
