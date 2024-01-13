package com.patterns.creational.abstractfactory;
/**
 * Factory for each sub-type of product
 */
public class ModernFurnitureFactory implements AbstractFurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

}
