package com.patterns.creational.singleton;

/**
 * METHOD 2 : THREAD SAFE SINGLETON
 */
public class Singleton2 {

	// The field for storing the singleton instance should be
    // declared private static.
	private static Singleton2 instance = null;

	public String value;
	
	// The singleton's constructor should always be private to
    // prevent direct construction calls with the "new"
    // operator.
	private Singleton2(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		this.value = value;
	}

	public static synchronized Singleton2 getInstance(String value) {
		if (instance == null) {
			instance = new Singleton2(value);
		}
		return instance;
	}
}
