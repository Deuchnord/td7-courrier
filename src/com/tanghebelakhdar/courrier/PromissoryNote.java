package com.tanghebelakhdar.courrier;

/**
 * A promissory note is a letter that contains money. 
 */
public class PromissoryNote extends Letter<Money> {
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money somme) 
	{
		super(sender, receiver, somme);
	}
	
	public float getCost()
	{
		return (1+(getMoney().getSum() / 100));
	}
	
	public TextContent getThankText()
	{
		return new TextContent("Thanks for the $"+getMoney().getSum()+"!");
		
	}

	@Override
	public void action() {
		this.getReceiver().credit(getMoney().getSum());
		this.getReceiver().getCity().postLetter(new SimpleLetter(getSender(), getReceiver(), getThankText()));
		
	}
	
	private Money getMoney() {
		
		return (Money) getContent();
		
	}

}
