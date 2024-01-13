package com.patterns.creational.abstractfactory;

/*
 * Particular sub-type of chair
 */
public class ArtDecoSofa implements Sofa {

	@Override
	public String show() {
		return "Showing an Art Deco Sofa";
	}

}
