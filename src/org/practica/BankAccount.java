package org.practica;

public class BankAccount {

	private static double balance;

	public BankAccount(double balance) { }

	public static double getBalance() {
		return BankAccount.balance;
	}

	public static void deposit(double amount) {
		double newBalance = balance;
		newBalance = newBalance + amount;
		try {
			Thread.sleep(300); 
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("Tu saldo: " + newBalance);
		balance = newBalance;
	}

	public static void withdraw(double amount) {
		if (BankAccount.balance < amount) {
			System.out.println("No hay balance suficiente!");
			return;
		}
		double newBalance = BankAccount.balance;
		newBalance = newBalance - amount;
		try {
			Thread.sleep(200); 
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("Tu saldo: " + newBalance);
		BankAccount.balance = newBalance;
	}
	
}
