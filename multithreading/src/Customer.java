package com.qspider.multithreading.Thread;

import com.qspider.multithreading.resource.Food;

public class Customer extends Thread {
	private Food food;
	
	
	public Customer(Food food) {
		
		this.food = food;
	}


	@Override
	public void run() {
		food.order();
	}
	
}
