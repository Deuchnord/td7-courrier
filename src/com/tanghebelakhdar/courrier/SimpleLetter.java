package com.tanghebelakhdar.courrier;

/**
 * A simple letter is a letter that contains a text.
 */
public class SimpleLetter extends Letter<TextContent>{
	
	private final float COST=1;
	
	/**
	 * Constructor
	 * @param sender the sender of the letter
	 * @param receiver the receiver of the letter
	 * @param content the content of the letter as a text
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent content) {
		super(sender, receiver, content);
	}
	@Override
	public float getCost() {
		return COST;
	}

	@Override
	public void action()
	{
	}
}
