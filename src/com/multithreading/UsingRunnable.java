package com.multithreading;

//class A implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("thread name is : "+Thread.currentThread().getName());
//
//	}
//	
//}

 public class UsingRunnable{
	public static void main(String[] args) {
//		A th1=new A();
//		A th2=new A();
		
		
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread name is : "+Thread.currentThread().getName());
				
			}
		});
		
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread name is : "+Thread.currentThread().getName());
				
			}
		});
		
		thread1.start();
		thread2.start();
		
	}
	
	

}






