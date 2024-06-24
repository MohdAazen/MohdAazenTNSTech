package com.company.assignment3;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Continent continentOne = new Continent("Asia",50,-20);
		continentOne.setNumber_of_countries(5);
		
		
		Countries countryOne = new Countries("India",48,2,"Hindi",140);
		countryOne.setNumber_of_states(28);
		countryOne.setCurrency("Rupee");
		
		State s1 = new State("Maharashtra", 4,47,"Marathi",15,"Malvani,Sangmeshwari,Khandeshi,Konkani,Warli,Vadvali,Samavedi", "Mangoes,Bananas,Grapes,Oranges,Rice,Wheat,Bajra");
		s1.setCapital("Mumbai");
		s1.setCities(30);
		
		State s2 = new State("Karnataka", 2,46,"Kannada",8,"Tulu,Coorgi,Konkani,Marathi,Tamil,Deccani Urdu,Marathi", "Rice,Maize,Sugarcane,Cardomom,Chillies,Coffee,Cashews");
		s2.setCapital("Mumbai");
		s2.setCities(30);
		
	
		System.out.println(continentOne.toString());
		System.out.println();
		System.out.println(countryOne.toString());
		System.out.println();
		System.out.println(s2.toString());
		
		
	}

}
