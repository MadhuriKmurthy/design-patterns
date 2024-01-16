package com.patterns.creational.prototype;

public class Rectangle extends Shape {

	private int width;
	private int height;
	

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
