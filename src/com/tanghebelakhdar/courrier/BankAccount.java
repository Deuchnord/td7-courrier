package com.tanghebelakhdar.courrier;

/**
 * Class for a bank account.
 * A bank account contains a certain amount of money.
 */
public class BankAccount {

	private float amount;
	
	/**
	 * Constructor
	 * @param sumOnBankAccount the sum on the bank account at its opening.
	 */
	public BankAccount(float sumOnBankAccount) {
		amount = sumOnBankAccount;
	}

	/**
	 * Adds money on the bank account
	 * @param amount the amount of money to add
	 */
	public void credit(float amount)
	{
		this.amount = this.amount + amount;
	}
	
	/**
	 * Removes money from the bank account
	 * @param amount the amount of money to remove
	 */
	public void debite(float amount)
	{
		this.amount = this.amount - amount;
	}
}
