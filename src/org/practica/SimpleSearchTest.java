package org.practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleSearchTest {

	@Test
	void test() {
		SimpleSearch[] mySearch = new SimpleSearch [1];
		mySearch[0] = "Prueba";
		assertequals("Prueba", mySearch.found());
		
	}

}
