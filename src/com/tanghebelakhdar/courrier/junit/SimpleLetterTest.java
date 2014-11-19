package com.tanghebelakhdar.courrier.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tanghebelakhdar.courrier.Inhabitant;
import com.tanghebelakhdar.courrier.SimpleLetter;
import com.tanghebelakhdar.courrier.TextContent;

public class SimpleLetterTest {

	SimpleLetter letter;
	Inhabitant i1, i2;
	TextContent content;
	
	@Before
	public void initLetter() {
		i1 = InitTests.newInhabitant();
		i2 = InitTests.newInhabitant();
		content = InitTests.newTextContent();
		
		letter = InitTests.newSimpleLetter(i1, i2, content);
	}

	@Test
	public void testGetCost() {
		assertEquals(1, letter.getCost(), 0);
	}

	@Test
	public void testGetReceiver() {
		assertEquals(i2, letter.getReceiver());
	}

	@Test
	public void testGetSender() {
		assertEquals(i1, letter.getSender());
	}

	@Test
	public void testGetContent() {
		assertEquals(content, letter.getContent());
	}

}
