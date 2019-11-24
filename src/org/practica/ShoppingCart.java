package org.practica;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart<T> implements Iterable<T> {

	private ArrayList<T> cart = new ArrayList<>();
	int max = 10;

	public ShoppingCart(int max) {
		super();
		this.max = max;
	}

	public void addToCart(T product) {
		if (cart.size() <= max) {
			cart.add(product);
		} else {
			throw new RuntimeException("Limit reached.");
		}
	}

	public Iterator<T> iterator() {
		return cart.iterator();
	}

	@SuppressWarnings("hiding")
	private <T extends Comparable<T>>void bubbleSort(T[] inputArray) {
		T temp;
		boolean swapped = true;
		for(int j = 1; j < inputArray.length & swapped; j++) {
			swapped = false;
			for(int i = 0; i < inputArray.length - j; i++) {
				if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
					temp = inputArray[i];
					inputArray[i] = inputArray[i+1];
					inputArray[i+1] = temp;
					swapped = true;
				}
			}
		}
		for(T i: inputArray) {
			System.out.print(" " + i);
		}
	}

}
