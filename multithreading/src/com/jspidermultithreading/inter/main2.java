package com.jspidermultithreading.inter;

public class main2 {
public static void main(String[] args) {
	
	Mythread2 mythread2 = new Mythread2();
	Thread thread = new Thread(mythread2);
	thread.start();
	
}
}
