package com.company.assignment3;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Continent continentOne = new Continent("Asia",50,-20);
		continentOne.setNumber_of_countries(5);
		
		
		Countries countryOne = new Countries("India",48,2,"Hindi",140);
		countryOne.setNumber_of_states(28);
		countryOne.setCurrency("Rupee");
		
		State s1 = new State("Maharashtra", 10,40,"Hindi",40,"Sindhi,Marathi,Punjabi,Kannada,Gujarati", "Rice,Wheat,Bajra,Toor");
		s1.setCapital("Mumbai");
		s1.setCities(30);
		
		State s2 = new State("Maharashtra", 10,40,"Hindi",40,"Sindhi,Marathi,Punjabi,Kannada,Gujarati", "Rice,Wheat,Bajra,Toor");
		s2.setCapital("Mumbai");
		s2.setCities(30);
		
		
		Continent continentTwo = new Continent("Asia",50,-20);
		continentTwo.setNumber_of_countries(5);
		
		Countries countryTwo = new Countries("India",48,2,"Hindi",140);
		countryTwo.setNumber_of_states(28);
		countryTwo.setCurrency("Rupee");
				State sc1 = new State("Maharashtra", 10,40,"Hindi",40,"Sindhi,Marathi,Punjabi,Kannada,Gujarati", "Rice,Wheat,Bajra,Toor");
		
		sc1.setCapital("Mumbai");
		sc1.setCities(30);
		
		State sc2 = new State("Maharashtra", 10,40,"Hindi",40,"Sindhi,Marathi,Punjabi,Kannada,Gujarati", "Rice,Wheat,Bajra,Toor");
		sc2.setCapital("Mumbai");
		sc2.setCities(30);
		
		State sc3 = new State("Maharashtra", 10,40,"Hindi",40,"Sindhi,Marathi,Punjabi,Kannada,Gujarati", "Rice,Wheat,Bajra,Toor");
		sc3.setCapital("Mumbai");
		sc3.setCities(30);
		
		System.out.println(continentOne.toString());
		System.out.println();
		System.out.println(countryTwo.toString());
		System.out.println();
		System.out.println(sc3.toString());
		
		
		
	}

}
