package com.tanghebelakhdar.courrier.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.tanghebelakhdar.courrier.City;
import com.tanghebelakhdar.courrier.Inhabitant;
import com.tanghebelakhdar.courrier.Letter;
import com.tanghebelakhdar.courrier.SimpleLetter;
import com.tanghebelakhdar.courrier.TextContent;

public class CityTest {

	protected City city;
	Inhabitant inhabitant1, inhabitant2;
	
	@Before
	public void testCity() {
		city = InitTests.newCity();
		inhabitant1 = InitTests.newInhabitant(city);
		inhabitant2 = InitTests.newInhabitant(city);
	}

	@Test
	public void testPostLetter() {
		
		SimpleLetter letter = new SimpleLetter(inhabitant1, inhabitant2, new TextContent("I am Who-You-Know."));
		city.postLetter(letter);
		ArrayList<Letter<?>> listExpected = new ArrayList<Letter<?>>();
		listExpected.add(letter);
		
		assertEquals(listExpected, city.getPostBoxContent());
		
	}

}
