package com.patterns.creational.builder;

public class User {
	public static void main(String[] args) {

		// User reaches out to House Builder Agency(Director)
		Director director = new Director();

		// Directors reaches out to independent Builders.
		// That's because application knows better which
		// builder to use to get a specific product.
		HouseBuilder builder = new HouseBuilder();
		
		director.buildSingleFamilyHome(builder);
		
		//Get the final House
		// Director is not aware and not dependent on concrete builders and
        // products.
		House house = builder.getResults();		
		
		System.out.println(house.print());

	}
}
