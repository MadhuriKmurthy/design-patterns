package com.patterns.creational.abstractfactory;

/**
 * Abstract factory - interface which can create products
 */
public interface AbstractFurnitureFactory {

	//Method that can return any type of chair object.
	Chair createChair();
	
	//Method that can return any type of sofa object.
	Sofa createSofa();
}
