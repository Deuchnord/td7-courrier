package com.tanghebelakhdar.courrier;

import java.util.ArrayList;

public class City {
	
	protected ArrayList<Inhabitant> habitants;
	protected Letter<?> letters;
	
	public void sendLetter(Letter<?> lettre)
	{
		this.letters.add(lettre);
	}
	
	public void distributeLetters()
	{
		this.letters.action();
	}

}
