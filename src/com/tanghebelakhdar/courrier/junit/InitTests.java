package com.tanghebelakhdar.courrier.junit;

import com.tanghebelakhdar.courrier.City;
import com.tanghebelakhdar.courrier.Inhabitant;
import com.tanghebelakhdar.courrier.Money;
import com.tanghebelakhdar.courrier.SimpleLetter;
import com.tanghebelakhdar.courrier.TextContent;

/**
 * Contains a set of static methods to instantiate quickly the necessary objects for the JUnit tests.  
 */
public class InitTests {

	/**
	 * @return An instance of City
	 */
	public static City newCity() {
		return new City("Godric's Hollow");
	}
	
	/**
	 * @return an instance of Inhabitant
	 */
	public static Inhabitant newInhabitant() {
		return newInhabitant(newCity());
	}
	
	/**
	 * @param city the city of the inhabitant
	 * @return an instance of Inhabitant
	 */
	public static Inhabitant newInhabitant(City city) {
		return new Inhabitant("Tom Marvolo Gaunt", city, 500);
	}
	
	/**
	 * @param sender the sender of the letter
	 * @param receiver the receiver of the letter
	 * @param content the content of the letter
	 * @return an instance of SimpleLetter
	 */
	public static SimpleLetter newSimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent content) {
		return new SimpleLetter(sender, receiver, content);
	}
	
	/**
	 * @return an instance of TextContent
	 */
	public static TextContent newTextContent() {
		return new TextContent("I'm the one who has to kill Harry Potter.");
	}

	public static Money newMoney(float amount) {
		return new Money(amount);
	}
	
}
