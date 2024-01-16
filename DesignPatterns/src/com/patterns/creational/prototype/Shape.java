package com.patterns.creational.prototype;

/**
 * Common shape - abstract class with abstract clone method
 */
public abstract class Shape {
	
	private String color;
	
	public Shape() {	
	}
	
	public Shape(Shape other) {
		if(other != null) {
			this.color = other.color;
		}
	}
	
	//clone abstract method
	public abstract Shape clone();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
