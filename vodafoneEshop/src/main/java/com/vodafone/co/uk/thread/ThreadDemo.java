package com.vodafone.co.uk.thread;

public class ThreadDemo implements Runnable {
	
	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadDemo());
		t.start();
		t.start();
	}
}


