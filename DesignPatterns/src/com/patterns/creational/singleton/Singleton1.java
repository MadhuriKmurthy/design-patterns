package com.patterns.creational.singleton;

/**
 * METHOD 1 : LAZY INITIALIZATION.
 */
public class Singleton1 {

	// The field for storing the singleton instance should be
    // declared private static.
	private static Singleton1 instance = null;
	
	public String value;

	// The singleton's constructor should always be private to
    // prevent direct construction calls with the "new"
    // operator.
	private Singleton1(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		this.value = value;
	}

	public static Singleton1 getInstance(String value) {
		if (instance == null) {
			instance = new Singleton1(value);
		}
		return instance;
	}
}
