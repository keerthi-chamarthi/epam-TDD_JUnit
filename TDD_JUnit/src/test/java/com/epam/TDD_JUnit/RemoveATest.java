package com.epam.TDD_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveATest {
	/*
	 * TODO list
	 * 1. If no A exist BBC=>BBC -Success
	 * 2. If A at 1st char ABC=>BC -Success
	 * 3. If A at 2nd char DAV=>DV -Success
	 * 4. If A at both 1st,2nd chars AABC=>BC -Success
	 * 5. If A other than 1st and 2nd chars BGAC=>BGAC -Success
	 */
	
	@Test
	void testRemovenoA() {
		RemoveA removeA = new RemoveA();
		String actual = removeA.modify("BBC");
		assertEquals("BBC",actual);
	}
	@Test
	void testRemove1stA() {
		RemoveA removeA = new RemoveA();
		String actual = removeA.modify("ABC");
		assertEquals("BC",actual);
	}
	@Test
	void testRemove2ndA() {
		RemoveA removeA = new RemoveA();
		String actual = removeA.modify("DAV");
		assertEquals("DV",actual);
	
	}
	@Test
	void testRemoveAs() {
		RemoveA removeA = new RemoveA();
		String actual = removeA.modify("AABC");
		assertEquals("BC",actual);
	
	}
	@Test
	void testRemoveOtherAs() {
		RemoveA removeA = new RemoveA();
		String actual = removeA.modify("BGAC");
		assertEquals("BGAC",actual);
	
	}
}
