package com.multithreading;



class Thread1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("run method overrided");
		System.out.println("thread name is : "+Thread.currentThread().getName());
	}
}


public class MainClass {

	public static void main(String[] args) {
		Thread1 th=new Thread1();
		Thread1 th1=new Thread1();
		
//		th.run();
		th.start();
		th1.start();

	}

}
