package com.jspider.Account.main;

import com.jspider.Account.resource.Account;
import com.jspider.Account.user.Husband;
import com.jspider.Account.user.Wife;

public class main {
	public static void main(String[] args) {
		Account account = new Account();

		Husband husband = new Husband(account);
		Wife wife = new Wife(account);

		husband.start();
		
		wife.start();
		
		
		
	}

	

}
