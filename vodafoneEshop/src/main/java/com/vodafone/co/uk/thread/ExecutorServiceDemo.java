package com.vodafone.co.uk.thread;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	ExecutorService executorService = Executors.newSingleThreadExecutor();

	public void asyncExecute() {
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});

		executorService.shutdown();
	}
	
	public void asyncSubmitRunnable() {
		@SuppressWarnings("rawtypes")
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});

		try {
			future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //returns null if the task has finished correctly.
	}
	
	@SuppressWarnings("rawtypes")
	public void asyncSubmitCallable(){
		@SuppressWarnings("unchecked")
		Future future = executorService.submit(() -> {
		    System.out.println("Asynchronous Callable");
		    return "Callable Result";
		});

		try {
			System.out.println("future.get() = " + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Map map = new ConcurrentHashMap<>();
		
		Map table = new Hashtable<>();

	}

}
