package com.tanghebelakhdar.courrier;

public class Money implements Content {
	private float sum;
	
	public Money(float amount) {
		this.sum = amount;
	}
	
	public float getMoney()
	{
		return this.sum;
	}
	
	public float getSum() {
		return sum;
	}
	
}
