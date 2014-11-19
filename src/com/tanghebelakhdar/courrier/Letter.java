package com.tanghebelakhdar.courrier;

/**
 * A letter
 * @param <T> the content of the letter
 */
public abstract class Letter <T extends Content> implements Content {
	private Inhabitant sender;
	private Inhabitant receiver;
	private Content content;
	
	/**
	 * Constructor
	 * @param sender the sender of the letter
	 * @param receiver the receiver of the letter
	 * @param content the content of the letter
	 */
	public Letter(Inhabitant sender,Inhabitant receiver, Content content)
	{
		this.sender=sender;
		this.receiver=receiver;
		this.content = content;
	}

	/**
	 * @return the cost of the letter
	 */
	public abstract float getCost();
	
	/**
	 * Executes some actions.
	 */
	public abstract void action();
	
	/**
	 * @return the receiver of the letter
	 */
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	
	/**
	 * @return the sender of the letter
	 */
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	/**
	 * @return the content of the letter
	 */
	public Content getContent()
	{
		return this.content;
	}

	
}
