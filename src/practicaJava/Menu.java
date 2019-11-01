package practicaJava;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Locale;

public class Menu {

	static ResourceBundle mybundle = ResourceBundle.getBundle("MessagesBundle");	

	public static void menu1() {
		System.out.println("---------------------------");
		System.out.println("1. " + mybundle.getString("option1"));
		System.out.println("2. " + mybundle.getString("option2"));
		System.out.println("3. " + mybundle.getString("option3"));
		System.out.println("4. " + mybundle.getString("option4"));
		System.out.println("---------------------------");
	}

	public static void menu2() {
		System.out.println("---------------------------");
		System.out.println("1. " + mybundle.getString("option5"));
		System.out.println("2. " + mybundle.getString("option6"));
		System.out.println("3. " + mybundle.getString("option7"));
		System.out.println("4. " + mybundle.getString("option8"));
		System.out.println("4. " + mybundle.getString("option8"));
		
		System.out.println("---------------------------");
	}

	@SuppressWarnings("resource")  // To avoid problems with Scanner
	public static void main(String[] args) {

		// Initialization Example
		ArrayList<Products> Blist = new ArrayList<Products>();
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

		ArrayList<Products> Mlist = new ArrayList<Products>();
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

		ArrayList<User> Ulist = new ArrayList<User>();

		Scanner data = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		int option = 0; 
		while (!exit) {
			try {
				switch (option) {

				case 1:
					System.out.println("---" + mybundle.getString("option1") + "---");
					System.out.print(mybundle.getString("name"));
					String nm = data.nextLine();
					System.out.print(mybundle.getString("srname"));
					String sn = data.nextLine();
					System.out.print("ID: ");
					String id = data.nextLine();
					System.out.print(mybundle.getString("psw"));
					String pw = data.nextLine();
					User user1 = new User(nm, sn , id , pw);
					//	HACER FUNCION PARA COMPROBAR CONTRASEÑA
					if(Ulist.contains(user1)) {
						if (pw.equals(user1.getPassword())){
							int option2 = 0;
							while (!exit) {
								try {
									switch (option2) {
									case 1:
										System.out.println("---" + mybundle.getString("option5") + "---");
										for(int i = 0; i < Blist.size(); i++) 
											System.out.println(i + " - " + Blist.get(i).getAttributes());
										System.out.print("Select a book (write the number): ");
										int f = data.nextInt();
										if (Blist.get(f).isAvailable()) {
											System.out.println(Blist.get(f).getTitle() + " has been borrowed. It must be returned within a maximum of 14 days.");
										} else {
											System.out.println("There are no copies of the book " + Blist.get(f).getTitle() + " available.");
										}
										break;

									case 2:
										System.out.println("---" + mybundle.getString("option6") + "---");
										for(int i = 0; i < Blist.size(); i++) 
											System.out.println(i + " - " + Blist.get(i).getAttributes());
										System.out.print("Select a book (write the number): ");
										int g = data.nextInt();
										if (Blist.get(g).isReturned()) {
											System.out.println("The book " + Blist.get(g).getTitle() +" has been returned. Thank you!");
										} else {
											System.out.println("There are no copies of the book " + Blist.get(g).getTitle() + " borrowed.");
										}
										break;

									case 3:
										System.out.println("---" + mybundle.getString("option6") + "---");
										for(int i = 0; i < Ulist.size(); i++) 
											System.out.println(i + " - " + Ulist.get(i).getAttributes());
										System.out.print("Select a user to delete (write the number): ");
										int z = data.nextInt();
										Ulist.remove(z);
										break;

									case 4:
										exit = true;
										break;
									}

									menu2();
									System.out.print("Option: ");
									option = sc.nextInt();

								} catch (InputMismatchException e) {
									System.out.println("Invalid character.");
									sc.next();
								}
							}
						}
					} else {
						System.out.println("ERROR.");
					}
					break;

				case 2:
					System.out.println("---" + mybundle.getString("option2") + "---");
					for(int i = 0; i < Ulist.size(); i++) 
						System.out.println(i + " - " + Ulist.get(i).getAttributes());
					System.out.print(mybundle.getString("name"));
					String nm2 = data.nextLine();
					System.out.print(mybundle.getString("srname"));
					String sn2 = data.nextLine();
					System.out.print("ID: ");
					String id2 = data.nextLine();
					System.out.print(mybundle.getString("psw"));
					String ps2 = data.nextLine();

					User user2 = new User(nm2, sn2 , id2 , ps2);
					Ulist.add(user2);
					break;

				case 3:
					System.out.println("Current Locale: " + Locale.getDefault());	
					Internationalization.selectLanguage();
					break;

				case 4:
					exit = true;
					System.out.println("Bye bye!");
					break;
					
				}
				menu1();
				System.out.print("Option: ");
				option = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Invalid character.");
				sc.next();
			}
		}
	}
}