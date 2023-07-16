package com.patterns.creational.factorymethod;

/**
 * Creator class: The Creator class declares the factory method that returns new
 * product objects. It’s important that the return type of this method matches
 * the product interface.
 */
public abstract class ManufactoringFactory {

	/**
	 * You can declare the factory method as abstract to force all subclasses to
	 * implement their own versions of the method. As an alternative, the base
	 * factory method can return some default product type.
	 */
	protected abstract MotorVehicle createMotorVehicle();
	
	public MotorVehicle create() {
		MotorVehicle createVehicle  = createMotorVehicle();
		createVehicle.build();
		return createVehicle;		
	}
}
