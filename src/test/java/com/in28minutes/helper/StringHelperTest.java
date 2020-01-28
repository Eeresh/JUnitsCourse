package com.in28minutes.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper;

	// @Before
	public void setUp() {
		helper = new StringHelper();
		System.out.println("inside set up");
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		// AACD-> CD, ACD->CD, CDEF->CDEF, CDAA->CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AisNotPresentInAnyPositions() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinLastPositions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		// ABCD->fasle, ABAB->true, AB->true, A->false
		// assertEquals(false,
		// helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveSceanrio() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_With2CharInputs() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_WithsingleCharInput() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}

	@After
	public void tearDown() {
		System.out.println("inside tear down");
	}
}
