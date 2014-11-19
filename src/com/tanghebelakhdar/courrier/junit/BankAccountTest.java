package com.tanghebelakhdar.courrier.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tanghebelakhdar.courrier.BankAccount;

public class BankAccountTest {

	@Test
	public void testGetAmount() {
		BankAccount b = new BankAccount(500);
		assertEquals(500, b.getAmount(), 0);
		
		b.credit(10);
		assertEquals(510, b.getAmount(), 0);
		
		b.debite(20);
		assertEquals(490, b.getAmount(), 0);
	}

}
