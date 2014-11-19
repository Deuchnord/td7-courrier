package com.tanghebelakhdar.courrier;

public class Money implements Content {
	private float sum;

	public Money(float sum)
	{
		this.sum=sum;
	}
	
	public float getSum() {
		return sum;
	}
	
}
