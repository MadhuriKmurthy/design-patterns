package com.patterns.creational.factorymethod;

public class Bike implements MotorVehicle {

	@Override
	public void build() {
		System.out.println("Building your Bajaj Pulsar bike");
	}

}
