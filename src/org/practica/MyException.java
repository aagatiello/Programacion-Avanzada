package org.practica;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class MyException extends Exception {

	public MyException(String s) {
		super(s);
	}

	private static void howIsInputMismatchException() throws InputMismatchException{
		try {
			@SuppressWarnings("resource")
			Scanner data = new Scanner(System.in);
			String a = data.nextLine();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Invalid Character.");
		}
	}

}
