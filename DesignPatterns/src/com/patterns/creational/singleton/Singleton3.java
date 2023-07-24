package com.patterns.creational.singleton;

/**
 * METHOD 3 : DOUBLE CHECKED LOCKING
 */
public class Singleton3 {

	// The field for storing the singleton instance should be
    // declared private static volatile.
	private static volatile Singleton3 instance = null;

	public String value;
	
	// The singleton's constructor should always be private to
    // prevent direct construction calls with the "new"
    // operator.
	private Singleton3(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		this.value = value;
	}

	// Ensure that the instance hasn't yet been
    // initialized by another thread while this one
    // has been waiting for the lock's release.
	public static Singleton3 getInstance(String value) {
		if (instance == null) {

			synchronized (Singleton3.class) {

				if (instance == null) {
					instance = new Singleton3(value);
				}
			}
		}
		return instance;
	}
}
