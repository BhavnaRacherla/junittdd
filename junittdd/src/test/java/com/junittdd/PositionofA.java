package com.junittdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionofA {

	@Test
	void testfirstchar() {
		Position p=new Position();
		String actual=p.deleteA("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
   void testsecondchar() {
	   Position p=new Position();
		String actual=p.deleteA("BACD");
		assertEquals("BCD",actual);
   }
	@Test
   void testtwochars() {
	   Position p=new Position();
		String actual=p.deleteA("AACD");
		assertEquals("CD",actual);
   }
	@Test
	void noChar() {
		Position p=new Position();
		String actual=p.deleteA("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void AfterFirstTwoChars() {
		Position p=new Position();
		String actual=p.deleteA("AABAA");
		assertEquals("BAA",actual);
	}
}
