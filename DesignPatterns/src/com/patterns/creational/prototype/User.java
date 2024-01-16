package com.patterns.creational.prototype;

public class User {

	public static void main(String[] args) {	
		
		//Create a Blue Rectangle object
		Shape rectangle = new Rectangle(10, 20);
		rectangle.setColor("Blue");
		
		//Create a Red Circle object
		Shape circle = new Circle(15);
		circle.setColor("Red");
		
		//Create clone of Rectangle and Circle
		Rectangle copyRectangle = (Rectangle) rectangle.clone();
		Circle copyCircle = (Circle) circle.clone();
		
		//Print and check
		System.out.println("Copy Rectangle : Height = " + copyRectangle.getHeight() + " Width = "+copyRectangle.getWidth() + " Color = "+ copyRectangle.getColor());
		System.out.println("Copy Circle : Radius = " + copyCircle.getRadius() + " Color = "+ copyCircle.getColor());
				
	}

}
