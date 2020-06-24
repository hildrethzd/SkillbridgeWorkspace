package com.skillstorm.threads;

public class LostUpdate {
	
	static BankAccount account = new BankAccount();
	public static void main(String[] args) throws InterruptedException {
		
		// earner
		Thread earner = new Thread(() -> {
			synchronized(account) {
			for(int x =0; x< 20000; x++) {
				account.deposit(100);
				
			}
			System.out.println("Earner " + account.balance);
			}
			
		});
		
		// spender
		Thread spender = new Thread(()-> {
			synchronized(account) {
			for(int x =0; x < 20000; x++) {
				account.withdraw(100);
				
			}
			System.out.println("Spender: " + account.balance);
			}
			

	});
		earner.start();
		//earner.join();
		spender.start();

}
}

class BankAccount {
	int balance =0;
	
	public void deposit(int funds) {
		balance = balance + funds;
	}
	
	public void withdraw(int funds) {
		balance -= funds;
	}
}

