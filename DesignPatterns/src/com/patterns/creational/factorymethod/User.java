package com.patterns.creational.factorymethod;

import java.util.Scanner;

public class User {

	private static ManufactoringFactory factory;
	
	public static void main(String[] args) {
		System.out.println("Which motor vehicle do you want to buy?");
		System.out.println("1. Telsa 2. Bajaj");
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			factory = new CarFactory();
		} else if(choice == 2) {
			factory = new BikeFactory();
		}
		
		factory.create();
		sc.close();
	}
	
}
