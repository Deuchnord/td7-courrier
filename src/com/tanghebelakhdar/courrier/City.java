package com.tanghebelakhdar.courrier;

import java.util.ArrayList;

/**
 * City class
 * A city is a set of inhabitants. It has a post-box in which the inhabitants can add their letters.
 * To distribute the letters in the post-box, call <code>distributeLetters()</code>. 
 */
public class City {
	
	protected String name;
	protected ArrayList<Inhabitant> habitants;
	protected ArrayList<Letter<?>> letters;
	
	/**
	 * Constructor
	 * @param name the name of the city
	 */
	public City(String name) {
		
		this.name = name;
		
	}

	/**
	 * Adds the letter in the post-box of the city.
	 */
	public void postLetter(Letter<?> letter)
	{
		this.letters.add(letter);
	}
	
	/**
	 * Distributes the letters in the post-box to their receivers.
	 */
	public void distributeLetters()
	{
		for(Letter<?> l : letters) {
			
			Inhabitant i = l.getReceiver();
			
			i.receiveLetter(l);
			
		}
	}

}
