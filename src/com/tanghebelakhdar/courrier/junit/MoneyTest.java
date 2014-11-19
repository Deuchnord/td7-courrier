package com.tanghebelakhdar.courrier.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

	@Before
	public void init() {
		InitTests.newMoney(500);
	}
	
	@Test
	public void testGetMoney() {
		
	}

	@Test
	public void testGetSum() {
		fail("Not yet implemented");
	}

}
