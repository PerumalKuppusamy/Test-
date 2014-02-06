package com.perumal.test;

public class Test {
		//boolean isRoundFinished = true;
		//int negativeBet = 0;
	public static boolean check(boolean isRoundFinished, int negativeBet) {
		if((isRoundFinished) && ((negativeBet == 0) || (negativeBet != 0))) {
			//System.out.println("true");
			return true;
		} else {
			//System.out.println("false");
			return false;
		}
	}
	
}
