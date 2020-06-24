package com.skillstorm.factory;

/*
	when the object creation depends upon the user data or some event;
	when which object is getting created is abstracted from the user;
	when the type of object created is to be decided at runtime.
 
 */

public class Factory {

	public static void main(String[] args) {
		Account savings = new SavingsAccount();
		
		Account savings2 = AccountFactory.openAccount("savings");
		savings2.open();
	}
}


class AccountFactory{
	public static Account openAccount(String type) {
		switch(type) {
		case "checking":
			return new CheckingAccount();
		case "retirement":
			return new RetirementAccount();
		
		case "savings":
			 return new SavingsAccount();
		default: return new CheckingAccount();
		}
	}	
}
class CheckingAccount implements Account{
	@Override
	public void open() {
		System.out.println("Openning Checking Account");	
	}	
}

class SavingsAccount implements Account{
	@Override
	public void open() {
		System.out.println("Openning Savings Account");	
	}	
}

class RetirementAccount implements Account{
	@Override
	public void open() {
		System.out.println("Openning Retirement Account");	
	}	
}

