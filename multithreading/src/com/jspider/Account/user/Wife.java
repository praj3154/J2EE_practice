package com.jspider.Account.user;

import com.jspider.Account.resource.Account;

public class Wife extends Thread {
	private Account account;

	public Wife (Account account) {
		
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.deposit(2000);
		account.withdeow(5000);
	
}
	
}
