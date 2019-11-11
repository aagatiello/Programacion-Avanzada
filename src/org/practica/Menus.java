package org.practica;

import java.util.ResourceBundle;

public class Menus {

	static ResourceBundle mybundle = ResourceBundle.getBundle("MessagesBundle");	

	public static void menu1() {
		System.out.println("---------------------------");
		System.out.println("1. " + mybundle.getString("option1"));
		System.out.println("2. " + mybundle.getString("option2"));
		System.out.println("3. " + mybundle.getString("option3"));
		System.out.println("4. " + mybundle.getString("option4"));
		System.out.println("5. " + mybundle.getString("option5"));
		System.out.println("6. " + mybundle.getString("option6"));
		System.out.println("---------------------------");
	}

	public static void menu2() {
		System.out.println("---------------------------");
		System.out.println("1. " + mybundle.getString("option7"));
		System.out.println("2. " + mybundle.getString("option8"));
		System.out.println("3. " + mybundle.getString("option9"));
		System.out.println("4. " + mybundle.getString("option10"));
		System.out.println("---------------------------");
	}

}
