package com.jspidermultithreading.theads;

public class Mythread5 extends Thread  {
	
	@Override
	public void run() {
	 
		System.out.println(" Hello from Mythread5");
		System.out.println("id = " + this.getId());
		
		System.out.println("Name = " + this.getName());
		System.out.println("priority " +this.getPriority());
		
		
	}

}
