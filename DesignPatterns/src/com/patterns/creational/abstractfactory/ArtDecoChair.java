package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of chair
 */
public class ArtDecoChair implements Chair{

	@Override
	public String show() {
		return "Showing an Art Deco Chair";
	}

}
