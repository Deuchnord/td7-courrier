package com.tanghebelakhdar.courrier;

public class Inhabitant {
	
	
	private String name;
	private City city;
	private BankAccount account;

	
	public String getNom()
	{
		return this.name;
	}
	
	public City getCity()
	{
		return this.city;
	}

	public void receiveLetter(Letter<?> lettre)
	{
		lettre.action();
	}

	public void postLetter() 
	{
		this.city.distributeLetters();
	}
}