package org.practica;

public class BankDeposit extends Thread {

	private BankAccount account;
	private double amount;
	private int transaction;

	public BankDeposit(BankAccount account, int transaction, double amount) {
		this.account = account;
		this.transaction = transaction;
		this.amount = amount;
	}

	@Override
	public void run() {
		for(int i = 1; i <= this.transaction; i++) {
			synchronized (this.account) {
				BankAccount.deposit(this.amount);
				this.account.notifyAll();
			}
		}
	}
	
}
