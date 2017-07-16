package com.vodafone.co.uk.thread;

public class StopAThread extends Thread {
	
	public volatile Thread stopFlag;
	
	@Override
	public synchronized void start() {
		stopFlag = new Thread(this);
		stopFlag.start();
	}
	
	public void stopThread() {
		stopFlag = null;
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(Thread.currentThread().getName());
		while (t==stopFlag) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			};
			
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		StopAThread t = new StopAThread();
		t.start();
		StopAThread t1 = new StopAThread();
		t1.stopThread();

	}

}
