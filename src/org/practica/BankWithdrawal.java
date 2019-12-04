package org.practica;

public class BankWithdrawal extends Thread {

	private BankAccount account;
	private double amount;
	private int transaction;

	public BankWithdrawal(BankAccount account, int transaction, double amount) {
		this.account = account;
		this.transaction = transaction;
		this.amount = amount;
	}

	@Override
	public void run() {
		for(int i = 1; i <= this.transaction; i++) {
			synchronized (this.account) {
				while(BankAccount.getBalance() < 10) {
					try {
						this.account.wait();
					} catch (InterruptedException ie) {
						System.err.println(ie.getMessage());
					}
				}
				BankAccount.withdraw(this.amount);
			}
		}
	}
	
}
