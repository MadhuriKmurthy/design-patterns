package com.patterns.creational.factorymethod;

/**
 * Concrete Product : Concrete Products are different implementations of the
 * product interface.
 */
public class Car implements MotorVehicle {

	@Override
	public void build() {
		System.out.println("Building your Telsa car!");
	}

}
