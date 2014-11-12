package com.tanghebelakhdar.courrier;

public class BankAccount {

	private float account;
	
	public void credit(float montant)
	{
		this.account = this.account + montant;
	}
	
	public void debite(float montant)
	{
		this.account = this.account - montant;
	}
}
