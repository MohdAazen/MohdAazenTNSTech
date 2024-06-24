package com.company.assignment3;

public class Continent {
	private int number_of_countries;
	public String name;
	public int highTempRecorded;
	public int lowTempRecorded;
		
	public int getNumber_of_countries() {
		return number_of_countries;
	}

	public void setNumber_of_countries(int number_of_countries) {
		this.number_of_countries = number_of_countries;
	}
	
	public Continent(String name,int highTempRecorded,int lowTempRecorded)
	{
		this.name = name;
		this.highTempRecorded = highTempRecorded ;
		this.lowTempRecorded = lowTempRecorded ;
		
	}

	@Override
	public String toString() {
		return "Continent [Name=" + name + ",\nNumber of countries=" + number_of_countries + ",\nHigh Temperature Recorded="
				+ highTempRecorded + ",\nLow Temperature Recorded=" + lowTempRecorded + "]";
	}
	
}
