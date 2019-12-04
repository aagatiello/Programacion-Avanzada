package org.practica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.practica.User.UserBuilder;

public class Main {

	static ResourceBundle mybundle = ResourceBundle.getBundle("MessagesBundle");

	public static void main(String[] args) {

		// Initialization Example
		ArrayList<Products> Blist = new ArrayList<>();
		Products book1 = new Books("The Lord of the Rings", "J. R. R. Tolkien", 9788373191723L, 20, 20);
		Blist.add(book1);
		Products book2 = new Books("The Alchemist", "Paulo Coelho", 9788576653721L, 25, 25);
		Blist.add(book2);
		Products book3 = new Books("The Little Prince", "Antoine de Saint-Exupéry", 9788310105110L, 30, 30);
		Blist.add(book3);
		Products book4 = new Books("Grimms' Fairy Tales", "Jacob and Wilhelm Grimm", 9787539142661L, 10, 10);
		Blist.add(book4);
		Products book5 = new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 9788700631625L, 15, 15);
		Blist.add(book5);
		Products book6 = new Books("And Then There Were None", "Agatha Christie", 9780062073488L, 20, 20);
		Blist.add(book6);
		Products book7 = new Books("Dream of the Red Chamber", "Cao Xueqin", 9787534243752L, 5, 5);
		Blist.add(book7);

		ArrayList<Products> Mlist = new ArrayList<>();
		Products movie1 = new Movies("The Godfather", "Francis Ford Coppola", 1972, 20, 20);
		Mlist.add(movie1);
		Products movie2 = new Movies("Casablanca", "Michael Curtiz", 1942, 25, 25);
		Mlist.add(movie2);
		Products movie3 = new Movies("Pulp Fiction", "Quentin Tarantino", 1994, 30, 30);
		Mlist.add(movie3);
		Products movie4 = new Movies("The Shawshank Redemption", "Frank Darabont", 1994, 10, 10);
		Mlist.add(movie4);
		Products movie5 = new Movies("Citizen Kane", "Orson Welles", 1941, 15, 15);
		Mlist.add(movie5);
		Products movie6 = new Movies("The Wizard of Oz", "Victor Fleming", 1939, 20, 20);
		Mlist.add(movie6);
		Products movie7 = new Movies("E.T. The Extra-Terrestrial", "Steven Spielberg", 1982, 5, 5);
		Mlist.add(movie7);

		ArrayList<User> Ulist = new ArrayList<>();

		@SuppressWarnings("resource")
		Scanner data = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		int option; 
		while (!exit) {	
			try {
				Menus.menu1();
				System.out.print("Option: ");
				option = sc.nextInt();
				switch (option) {

				case 1: 
					System.out.println("---" + mybundle.getString("option1") + "---");
					System.out.print(mybundle.getString("id"));
					String id = data.nextLine();
					System.out.print(mybundle.getString("psw"));
					String pw = data.nextLine();
					if (User.authentification(id, pw, Ulist)){

						new ShoppingCart(20);
						BankAccount.deposit(20);
						boolean exit2 = false;
						int option2 = 0;

						while (!exit2) {	
							try {
								Menus.menu2();
								System.out.print("Option: ");
								option2 = sc.nextInt();
								switch (option2) {

								case 1:
									System.out.println("---" + mybundle.getString("option7") + "---");
									System.out.println(mybundle.getString("select"));
									int a = data.nextInt();
									if(a == 1) {
										for(int i = 0; i < Blist.size(); i++) 
											System.out.println(i + " - " + Blist.get(i).getAttributes());
										System.out.print(mybundle.getString("number"));
										int b = data.nextInt();
										if (Blist.get(b).isAvailable() && BankAccount.getBalance() > 0) {
											System.out.println(Blist.get(b).getTitle() + mybundle.getString("borrowed"));
											String product= String.valueOf(b);
											ShoppingCart.addToCart(product);
											BankAccount.withdraw(5.5);
										}
										else System.out.println(mybundle.getString("available") + Blist.get(b).getTitle());
									} else if (a == 2) {
										for(int i = 0; i < Mlist.size(); i++) 
											System.out.println(i + " - " + Mlist.get(i).getAttributes());
										System.out.print(mybundle.getString("number"));
										int b = data.nextInt();
										if (Mlist.get(b).isAvailable() && BankAccount.getBalance() > 0) {
											System.out.println(Mlist.get(b).getTitle() + mybundle.getString("borrowed"));
											String product= String.valueOf(b);
											ShoppingCart.addToCart(product);
											BankAccount.withdraw(5.5);
										}
										else System.out.println(mybundle.getString("available") + Mlist.get(b).getTitle());
									} else System.out.println("ERROR.");
									break;

								case 2:
									System.out.println("---" + mybundle.getString("option8") + "---");
									System.out.println(mybundle.getString("select"));
									int c = data.nextInt();
									if(c == 1) {
										for(int i = 0; i < Blist.size(); i++) 
											System.out.println(i + " - " + Blist.get(i).getAttributes());
										System.out.print(mybundle.getString("number"));
										int d = data.nextInt();
										if (Blist.get(d).isReturned()) System.out.println(Blist.get(d).getTitle() + mybundle.getString("returned"));
										else System.out.println(mybundle.getString("nocopies") + Blist.get(d).getTitle());
									} else if (c == 2) {
										for(int i = 0; i < Mlist.size(); i++) 
											System.out.println(i + " - " + Mlist.get(i).getAttributes());
										System.out.print(mybundle.getString("number"));
										int d = data.nextInt();
										if (Mlist.get(d).isReturned()) System.out.println(Mlist.get(d).getTitle() + mybundle.getString("returned"));
										else System.out.println(mybundle.getString("nocopies") + Mlist.get(d).getTitle());
									} else System.out.println("ERROR.");
									break;

								case 3:
									System.out.println("---" + mybundle.getString("option9") + "---");
									BankAccount.deposit(10);
									break;

								case 4:
									exit2 = true;
									break;

								default:
									System.out.println("Opcion invalida");
									break;
								}

							} catch (InputMismatchException e) {
								System.out.println("Caracter invalido");
								sc.next();
							}
						}
					} else {
						System.out.println("ERROR.");
					}
					break;

				case 2:
					System.out.println("---" + mybundle.getString("option2") + "---");

					System.out.print(mybundle.getString("name"));
					String nm2 = data.nextLine();
					System.out.print(mybundle.getString("srname"));
					String sn2 = data.nextLine();
					System.out.print(mybundle.getString("id"));
					String id2 = data.nextLine();
					System.out.print(mybundle.getString("psw"));
					String ps2 = data.nextLine();

					UserBuilder userBuilder = new UserBuilder(nm2, sn2 , id2 , ps2);
					User user = new User(userBuilder);
					Ulist.add(user);
					break;

				case 3:
					System.out.println("---" + mybundle.getString("option3") + "---");
					if(Ulist.isEmpty()) System.out.println(mybundle.getString("users"));
					else for(int i = 0; i < Ulist.size(); i++) System.out.println(i + " - " + Ulist.get(i).getAttributes());
					break;

				case 4:
					System.out.println("---" + mybundle.getString("option4") + "---");
					if(Ulist.isEmpty()) System.out.println(mybundle.getString("users"));
					else {
						for(int i = 0; i < Ulist.size(); i++) System.out.println(i + " - " + Ulist.get(i).getAttributes());
						System.out.print(mybundle.getString("number"));
						int z = data.nextInt();
						if(z > Ulist.size()) System.out.println(mybundle.getString("users"));
						else {
							Ulist.remove(z);
							System.out.println(mybundle.getString("deleted"));
						}
					}
					break;

				case 5:
					System.out.println("---" + mybundle.getString("option5") + "---");
					System.out.println("Current Locale: " + Internationalization.getCurrentLocale());	
					Internationalization.selectLanguage();
					break;

				case 6:
					exit = true;
					System.out.println(mybundle.getString("bye"));
					break;

				default:
					System.out.println("Invalid option");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid character.");
				sc.next();
			}
		}
	}

}