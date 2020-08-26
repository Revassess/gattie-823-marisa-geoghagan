package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(int num) {
		String stringNum = String.valueOf(num);
		char[] digits = stringNum.toCharArray();
		int[] powerDigits = new int[digits.length];
		int sum = 0;
		
		for(int i = 0; i < powerDigits.length; i++) {
			powerDigits[i] = (int) Math.pow(charToInt(digits[i]), powerDigits.length);
			sum += powerDigits[i];
		}
		
		return num == sum;
	}

	public static int charToInt(char input) {
		boolean isInt = false;
		
		try { 
			isInt = true;
			Character.getNumericValue(input);
		}
		catch(NumberFormatException e) { }
		catch(NullPointerException e) { }
		
		if(isInt) {
			return Character.getNumericValue(input);
		} else {
			return 0;
		}
	}
}
