package com.tanghebelakhdar.courrier;

/**
 * A registered letter contains the letter addressed to the receiver. When it is received, it sends a message to the sender to tell him/her
 * that the letter was well received. 
 * @param <L> the type of the letter that was sent as registered.
 */
public class RegisteredLetter<L> extends Letter<Letter<?>> {

	/**
	 * Constructor
	 * @param sender the sender of the letter
	 * @param receiver the receiver of the letter
	 * @param letter the letter sent as registered
	 */
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, Content letter) {
		
		super(sender, receiver, letter);
		
	}

	@Override
	public float getCost() {
		return ((Letter<?>) getContent()).getCost() + 15;
	}

	@Override
	public void action() {
		
		((Letter<?>) super.getContent()).action();		
		
		super.getSender().getCity().postLetter(new SimpleLetter(getReceiver(), getSender(), new TextContent("Message received")));
		
	}

}
