package com.patterns.creational.abstractfactory;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		
		//Users contact the furniture store
		MadFurnitureStore madFurnitureStore;
		
		//Store owners contact the main factory
		AbstractFurnitureFactory abstractFurnitureFactory;
		
		System.out.println("Welcome to Mads Furniture Store");
		System.out.println("What type of furniture do you want to buy?");
		System.out.println("1. Modern 2.Victorian 3.ArtDeco");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		//Main factory is set to user requirement
		if("1".equals(input)) {
			abstractFurnitureFactory = new  ModernFurnitureFactory();
		} else if("2".equals(input)) {
			abstractFurnitureFactory = new VictorianFurnitureFactory();
		} else {
			abstractFurnitureFactory = new ArtDecoFurnitureFactory();
		}
		//Load which ever type the user ask for to the furniture store
		madFurnitureStore = new MadFurnitureStore(abstractFurnitureFactory);
		
		//Show to your clients
		madFurnitureStore.show();
		
	}

}
