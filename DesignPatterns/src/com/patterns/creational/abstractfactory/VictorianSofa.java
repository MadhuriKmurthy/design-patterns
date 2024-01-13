package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of sofa
 */
public class VictorianSofa implements Sofa{

	@Override
	public String show() {
		return "Showing a Victorian Sofa";
	}

}
