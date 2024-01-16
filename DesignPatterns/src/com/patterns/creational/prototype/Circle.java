package com.patterns.creational.prototype;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(Circle target) {
		super(target);
		if(target != null) {
			this.radius = target.radius;
		}
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

}
