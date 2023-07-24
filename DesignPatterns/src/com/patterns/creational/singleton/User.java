package com.patterns.creational.singleton;

public class User {

	public static void main(String[] args) {
		
		//"If you see the same value, then singleton was reused (yay!)"
        //"If you see different values, then 2 singletons were created (booo!!)"
		System.out.println("Creating 2 threads, both use singleton 1:");
		Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Creating 2 threads, both use singleton 2:");
		Thread threadThree = new Thread(new ThreadThree());
        Thread threadFour = new Thread(new ThreadFour());
        threadThree.start();
        threadFour.start();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Creating 2 threads, both use singleton 3:");
		Thread threadFive = new Thread(new ThreadFive());
        Thread threadSix = new Thread(new ThreadSix());
        threadFive.start();
        threadSix.start();
	}
	
	static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton1 singleton = Singleton1.getInstance("ONE");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton1 singleton = Singleton1.getInstance("TWO");
            System.out.println(singleton.value);
        }
    }
    
    static class ThreadThree implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton = Singleton2.getInstance("THREE");
            System.out.println(singleton.value);
        }
    }

    static class ThreadFour implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton = Singleton2.getInstance("FOUR");
            System.out.println(singleton.value);
        }
    }
    
    static class ThreadFive implements Runnable {
        @Override
        public void run() {
            Singleton3 singleton = Singleton3.getInstance("FIVE");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSix implements Runnable {
        @Override
        public void run() {
            Singleton3 singleton = Singleton3.getInstance("SIX");
            System.out.println(singleton.value);
        }
    }
}
