package com.in28minutes.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {1, 13, 2, 15, 3};
		int[] expected = {1, 2, 3, 13, 15};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		// int[] numbers = {};
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = {12, 15, 24};
		for (int i = 0; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
