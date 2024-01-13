package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of chair
 */
public class ModernChair implements Chair{

	@Override
	public String show() {
		return "Showing a Modern Chair";
	}

}
