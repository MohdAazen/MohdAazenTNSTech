package com.company.assignment3;

public class Countries extends Continent
{
	private int number_of_states;
	private String currency;
	
	public int getNumber_of_states() {
		return number_of_states;
	}
	public void setNumber_of_states(int number_of_states) {
		this.number_of_states = number_of_states;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String language;
	public int population;
	public Countries(String name, int highTempRecorded, int lowTempRecorded,
			String language, int population) {
		super(name, highTempRecorded, lowTempRecorded);
		this.language = language;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Countries [ Name=" + name + ", \nHigh Temp Recorded=" + highTempRecorded + ", \nLow Temp Recorded=" + lowTempRecorded
				+ ", \nNational Language=" + language
				+ ", \nPopulation(in cr)=" + population + ",\nNumber_of_states=" + getNumber_of_states() + ", \nCurrency()="
				+ getCurrency() + "]";
	}
	
		
	
	
	
}
