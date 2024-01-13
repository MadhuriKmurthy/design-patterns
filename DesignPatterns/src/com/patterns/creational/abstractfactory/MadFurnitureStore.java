package com.patterns.creational.abstractfactory;

/**
 * Class is responsible for taking any sub - factory, creating its object and return its functions
 * This is used by clients.
 */
public class MadFurnitureStore {
	
	private Chair chair;
	private Sofa sofa;
	
	public MadFurnitureStore(AbstractFurnitureFactory abstractFurnitureFactory) {
		chair = abstractFurnitureFactory.createChair();
		sofa = abstractFurnitureFactory.createSofa();
	}
	
	public void show() {
		System.out.println(chair.show());
		System.out.println(sofa.show());
	}

}
