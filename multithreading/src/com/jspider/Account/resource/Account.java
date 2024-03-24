package com.jspider.Account.resource;

public class Account {
private double accountBalance;

public void deposit( double amount ) {
	System.out.println(" Amount of rupees" + amount+ " has been credited ");

	accountBalance+= amount;
	
	System.out.println( accountBalance);
	
}
public void withdeow( double amount ) {
	System.out.println(" Amount of rupees" + amount+ " has been debited");

	accountBalance-= amount;
	System.out.println( accountBalance);
}
}
