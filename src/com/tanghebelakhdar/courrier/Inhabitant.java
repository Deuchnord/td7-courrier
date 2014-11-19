package com.tanghebelakhdar.courrier;

/**
 * Inhabitant class
 * An inhabitant is defined with:
 * - A name
 * - A city
 * - A bank account.
 */
public class Inhabitant {
	
	private String name;
	private City city;
	private BankAccount account;

	/**
	 * Constructor
	 * @param name the name of the inhabitant
	 * @param city the city of the inhabitant
	 * @param sumOnBankAccount the sum on the bank account
	 */
	public Inhabitant(String name, City city, float sumOnBankAccount) {
		
		this.name = name;
		this.city = city;
		account = new BankAccount(sumOnBankAccount);
		
	}

	/**
	 * @return the name of the inhabitant
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * @return the city of the inhabitant
	 */
	public City getCity()
	{
		return this.city;
	}

	/**
	 * Gives the letter to the inhabitant.
	 * @param letter the letter addressed to the inhabitant.
	 */
	public void receiveLetter(Letter<?> letter)
	{
		letter.action();
	}

	/**
	 * Credits the bank account from <code>amount</code>.
	 * @param amount
	 */
	public void credit(float amount) {
		account.credit(amount);
		
	}
}