package org.practica;

import org.junit.jupiter.api.Test;

class BankDepositTest {

	@Test
	void testRun() {
		BankAccount account = new BankAccount(0);
		Thread[] process = new Thread[1];
		process[0] = new BankDeposit(account, 15, 10.0);

		for(int i = 0; i < process.length; i++) {
			process[i].start();
		}

		for(int i = 0; i < process.length; i++) {
			try {
				process[i].join();
			} catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			} finally {
				System.out.println("Finaliza transacción "+ (i+1));
			}
		}
		System.out.println("Saldo final: " + BankAccount.getBalance());
	}
	
}
