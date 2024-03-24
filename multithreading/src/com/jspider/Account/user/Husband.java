package com.jspider.Account.user;

import com.jspider.Account.resource.Account;

public class Husband  extends Thread {
	private Account account;

	public Husband(Account account) {
		
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.deposit(10000);
		account.withdeow(5000);
	}
	

	

}
