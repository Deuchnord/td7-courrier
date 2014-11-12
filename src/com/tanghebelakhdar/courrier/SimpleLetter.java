package com.tanghebelakhdar.courrier;

public class SimpleLetter extends Letter<TextContent>{
	
	private final float COST=1;
		
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent texte) {
		super(sender, receiver, texte);
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
