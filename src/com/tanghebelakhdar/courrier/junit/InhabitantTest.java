package com.tanghebelakhdar.courrier.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tanghebelakhdar.courrier.City;
import com.tanghebelakhdar.courrier.Inhabitant;

public class InhabitantTest {

	private Inhabitant inhabitant;
	private City city;
	
	@Before
	public void createInhabitant() {
		city = InitTests.newCity();
		inhabitant = InitTests.newInhabitant(city);
	}

	@Test
	public void testGetName() {
		assertEquals("Tom Marvolo Gaunt", inhabitant.getName());
	}

	@Test
	public void testGetCity() {
		assertEquals(city, inhabitant.getCity());
	}

}
