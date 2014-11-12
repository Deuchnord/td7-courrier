package com.tanghebelakhdar.courrier;
 
public abstract class Letter <T extends Content> implements Content {
	private Inhabitant sender;
	private Inhabitant receiver;
	private Content c;
	
	public Letter(Inhabitant sender,Inhabitant receiver, Content c)
	{
		this.sender=sender;
		this.receiver=receiver;
		this.c = c;
	}

	public abstract float getCost();
	public abstract void action();
	
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	public Content getC()
	{
		return this.c;
	}

	public void add(Letter lettre)
	{
		//!!!
	}
}
