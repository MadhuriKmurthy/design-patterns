package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of chair
 */
public class VictorianChair implements Chair{

	@Override
	public String show() {
		return "Showing a Victorian Chair";
	}

}
