package org.practica;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Internationalization {

	private static Locale currentLocale = new Locale("es", "ES");
	private static ResourceBundle introLabels;

	public static Locale getCurrentLocale() {
		return currentLocale;
	}

	public static ResourceBundle getIntroLabels() {
		return introLabels;
	}

	public static Locale selectLanguage(){

		System.out.println("1. Spanish");
		System.out.println("2. English");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		if(select == 1) {
			currentLocale = new Locale("es", "ES");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_es_ES", currentLocale));
		} else if(select == 2) {
			currentLocale = new Locale("en", "US");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_en_US", currentLocale));
		} else {
			System.out.println("Invalid Number");
		}
		return currentLocale;
	}

	public static void setIntroLabels(ResourceBundle introLabels) {
		Internationalization.introLabels = introLabels;
	}

}