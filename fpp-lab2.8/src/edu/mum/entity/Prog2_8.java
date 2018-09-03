package edu.mum.entity;

public class Prog2_8 {
	
	public static int min(int[] arrayOfInts) {
		
		int tempMin = arrayOfInts[0];
		
		for(int i = 1; i < arrayOfInts.length; i++) {
			
			int[] tempArray = {tempMin,arrayOfInts[i]};
			tempMin = getMinBetweenTwoNumbers(tempArray);
			
		}
		
		return tempMin;
	}
	
	public static int getMinBetweenTwoNumbers(int[] arrayOfTwoInts) {
		
		int tempMin = arrayOfTwoInts[0];
		
		if(tempMin > arrayOfTwoInts[1]) {
			tempMin = arrayOfTwoInts[1];		
		}
		
		return tempMin;
	}

}
