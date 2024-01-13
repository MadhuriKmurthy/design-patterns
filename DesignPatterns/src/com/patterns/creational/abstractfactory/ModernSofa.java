package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of sofa
 */
public class ModernSofa implements Sofa{

	@Override
	public String show() {
		return "Showing a Modern Sofa";
	}

}
