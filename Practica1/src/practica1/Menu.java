package practica1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	@SuppressWarnings({ "resource" }) // To avoid problems with Scanner

	public static void main(String[] args) {

		// Initialization of a library example
		ArrayList<Book> Blist = new ArrayList<Book>();
		Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", 9788373191723L, 20, 20);
		Blist.add(book1);
		Book book2 = new Book("The Alchemist", "Paulo Coelho", 9788576653721L, 25, 25);
		Blist.add(book2);
		Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 9788310105110L, 30, 30);
		Blist.add(book3);
		Book book4 = new Book("Grimms' Fairy Tales", "Jacob and Wilhelm Grimm", 9787539142661L, 10, 10);
		Blist.add(book4);
		Book book5 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 9788700631625L, 15, 15);
		Blist.add(book5);
		Book book6 = new Book("And Then There Were None", "Agatha Christie", 9780062073488L, 20, 20);
		Blist.add(book6);
		Book book7 = new Book("Dream of the Red Chamber", "Cao Xueqin", 9787534243752L, 5, 5);
		Blist.add(book7);

		ArrayList<User> Ulist = new ArrayList<User>();

		Scanner data = new Scanner(System.in);

		System.out.println("Welcome to your online library! What would you like to do?");

		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int option; 

		while (!exit) {

			System.out.println("---------------------------");
			System.out.println("1. Register new user.");
			System.out.println("2. Unsubscribe user.");
			System.out.println("3. Make book loan.");
			System.out.println("4. Return book loan.");
			System.out.println("5. Exit.");
			System.out.println("---------------------------");

			try {

				System.out.print("Option: ");
				option = sc.nextInt();

				switch (option) {

				case 1:
					System.out.println("REGISTER NEW USER");
					for(int i = 0; i < Ulist.size(); i++) 
						System.out.println(i + " - " + Ulist.get(i).getAttributes());
					System.out.print("Name: ");
					String a = data.nextLine();
					System.out.print("Surname: ");
					String b = data.nextLine();
					System.out.print("ID: ");
					String c = data.nextLine();
					User d = new User(a,b,c);
					Ulist.add(d);
					break;

				case 2:
					System.out.println("UNSUBSCRIBE A USER");
					for(int i = 0; i < Ulist.size(); i++) 
						System.out.println(i + " - " + Ulist.get(i).getAttributes());
					System.out.print("Select a user to delete (write the number): ");
					int e = data.nextInt();
					Ulist.remove(e);
					break;

				case 3:
					System.out.println("MAKE A BOOK LOAN");
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

				case 4:
					System.out.println("RETURN BOOK LOAN");
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

				case 5:
					System.out.println("Bye bye!");
					exit = true;
					break;

				default:
					System.out.println("Please, only numbers between 1 and 5.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid character.");
				sc.next();
			}
		}

	}

}