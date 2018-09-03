package edu.mum.test;

import static org.junit.jupiter.api.Assertions.*;

//Using TDD
// Step 1: I need a method to compare two numbers 
//		   I need a method that take the min of an array

//Step 2: Create the methods

//Step 3: Refactor

import org.junit.jupiter.api.Test;

import edu.mum.entity.Prog2_8;

class TestProg8 {
	
	int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	int[] arrayOfInts1 = {-50, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	int[] arrayOfInts2 = {50, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

	@Test
	void testGetMinBetweenTwoNumbers() {
		int[] arrayOfTwoInts = {2, -21};
		assertEquals(-21, Prog2_8.getMinBetweenTwoNumbers(arrayOfTwoInts));
		
		int[] arrayOfTwoInts1 = {-21, -3};
		assertEquals(-21, Prog2_8.getMinBetweenTwoNumbers(arrayOfTwoInts1));
		
		int[] arrayOfTwoInts2 = {-21, 0};
		assertEquals(-21, Prog2_8.getMinBetweenTwoNumbers(arrayOfTwoInts2));
	}
	
	@Test
	void testMin() {
		assertEquals(-22, Prog2_8.min(arrayOfInts));
		assertEquals(-50, Prog2_8.min(arrayOfInts1));
		assertEquals(0, Prog2_8.min(arrayOfInts2));
	}

}
