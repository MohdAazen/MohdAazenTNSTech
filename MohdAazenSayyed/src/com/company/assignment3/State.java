package com.company.assignment3;

public class State extends Countries {
	private int cities;
	private String capital;
	
	public int getCities() {
		return cities;
	}

	public void setCities(int cities) {
		this.cities = cities;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String otherLanguagesUsed;
	public String cropsProduce;
	
	public State(String name, int highTempRecorded, int lowTempRecorded, 
			String language, int population, 
			String otherLanguagesUsed,
			String cropsProduce) {
		super(name, highTempRecorded, lowTempRecorded, language, population);
		this.otherLanguagesUsed = otherLanguagesUsed;
		this.cropsProduce = cropsProduce;
	}

	@Override
	public String toString() {
		return "State [cities=" + cities + ", capital=" + capital + ", otherLanguagesUsed=" + otherLanguagesUsed
				+ ", cropsProduce=" + cropsProduce + ", language=" + language + ", population=" + population + ", name="
				+ name + ", highTempRecorded=" + highTempRecorded + ", lowTempRecorded=" + lowTempRecorded + "]";
	}

	
	
	
}
