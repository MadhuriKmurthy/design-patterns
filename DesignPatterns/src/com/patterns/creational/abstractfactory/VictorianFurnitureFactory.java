package com.patterns.creational.abstractfactory;
/**
 * Factory for each sub-type of product
 */
public class VictorianFurnitureFactory implements AbstractFurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

}
