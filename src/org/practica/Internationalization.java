package org.practica;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Internationalization {

	static ResourceBundle introLabels;

	static Locale selectLanguage(){

		Locale currentLocale;

		System.out.println("1. Spanish");
		System.out.println("2. English");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		if(select == 1) {
			currentLocale = new Locale("es", "ES");
			introLabels = ResourceBundle.getBundle("MessagesBundle_es_ES", currentLocale);
		} else {
			currentLocale = new Locale("en", "US");
			introLabels = ResourceBundle.getBundle("MessagesBundle_en_US", currentLocale);
		}
		return currentLocale;
	}
}