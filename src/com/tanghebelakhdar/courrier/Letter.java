package com.tanghebelakhdar.courrier;
 
public abstract class Letter <T extends Content> implements Content {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected float cout;
	protected Content c;
	
	public Letter(Inhabitant sender,Inhabitant receiver, Content c)
	{
		this.cout = 0;
		this.sender=sender;
		this.receiver=receiver;
		this.c = c;
	}

	public abstract float getCout();
	
	public abstract String toString();
	
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
}
