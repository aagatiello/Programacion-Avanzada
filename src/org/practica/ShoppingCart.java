package org.practica;

import java.util.ArrayList;

public class ShoppingCart {

	// Creational pattern applied (Singleton)

	private static ArrayList<String> cart;
	private static ShoppingCart instance = null;
	private static int max;

	public static void addToCart(String product) {
		if (cart.size() <= max) {
			cart.add(product);
		} else {
			System.out.println("Limit reached.");
		}
	}

	public static synchronized ShoppingCart getInstancia() {
		if (instance == null)
			instance = new ShoppingCart(20);
		return instance;
	}

	public ShoppingCart(int max) {
		ShoppingCart.cart = new ArrayList<>();
		ShoppingCart.max = max;
	}

	public void bubbleSort(ArrayList<String> list) {
		String temp;
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.size()-1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}

	public String getProducts() {
		String products = "";
		for (String p : ShoppingCart.cart)
			products = products + p + "\n";
		return products;
	}

}
