package org.practica;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	@Test
	void testGetInstancia() {
		ShoppingCart instance = new ShoppingCart(10);
	}

	@Test
	void testBubbleSort() {
		ArrayList<String> cart = new ArrayList<>();
		cart.add("10");
		cart.add("5");
		cart.add("27");
		cart.add("88");
	}

	@Test
	void testGetProducts() {
		ArrayList<String> cart = new ArrayList<>();
		cart.add("a");
		cart.add("e");
		cart.add("o");
		cart.add("u");
	}

}
