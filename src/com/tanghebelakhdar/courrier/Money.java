package com.tanghebelakhdar.courrier;

public class Money implements Content {
	private float sum;
<<<<<<< HEAD

	public Money(float sum)
=======
	
	public Money(float amount) {
		this.sum = amount;
	}
	
	public float getMoney()
>>>>>>> d878e24999da2e9ccee848982fb1b3ec86019fd1
	{
		this.sum=sum;
	}
	
	public float getSum() {
		return sum;
	}
	
}
