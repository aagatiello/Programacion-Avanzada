package practicaJava;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Internationalization {
	private static int select;

	static Locale currentLocale = new Locale("es", "ES");
	static ResourceBundle introLabels = ResourceBundle.getBundle("MessagesBundle_es_ES");

	public Locale getCurrentLocale() {
		return currentLocale;
	}

	public static ResourceBundle getIntroLabels() {
		return introLabels;
	}

	@SuppressWarnings("resource") // To avoid problems with Scanner
	static void selectLanguage(){

		System.out.println("1. Spanish");
		System.out.println("2. English");
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		switch(select) {

		case 1:
			Locale currentLocale = new Locale("es", "ES");
			introLabels = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			break;

		case 2:
			Locale currentLocale2 = new Locale("en", "US");
			introLabels = ResourceBundle.getBundle("MessagesBundle", currentLocale2);
			break;
		}
	}
}