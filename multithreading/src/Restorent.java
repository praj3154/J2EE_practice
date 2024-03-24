package com.qspider.multithreading.Thread;

import com.qspider.multithreading.resource.Food;

public class Restorent extends Thread{
	private Food food;

	public Restorent(Food food) {
		super();
		this.food = food;
	}
	
	@Override
	public void run() {
		food.prepare();
	}
	
	
	

}
