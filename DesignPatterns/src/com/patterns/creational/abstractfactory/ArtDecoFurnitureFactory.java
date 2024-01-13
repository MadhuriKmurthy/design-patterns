package com.patterns.creational.abstractfactory;
/**
 * Factory for each sub-type of product
 */
public class ArtDecoFurnitureFactory implements AbstractFurnitureFactory {

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

}
