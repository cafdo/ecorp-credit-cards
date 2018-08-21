package com.ecorp.beans;

public class FakeCardNumber {
	private final String numberOfCards;
	private final String dayToProcess;
	public FakeCardNumber(String dayToProcess, String numberOfCards) {
		super();
		this.numberOfCards = numberOfCards;
		this.dayToProcess = dayToProcess;
	}
	public String getNumberOfCards() {
		return numberOfCards;
	}
	public String getDayToProcess() {
		return dayToProcess;
	}
	
	

}
