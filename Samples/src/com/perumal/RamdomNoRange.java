package com.perumal;

import java.util.Random;

public class RamdomNoRange {

	/** Generate random integers in a certain range. */
	public static final void main(String... aArgs) {
		log("Generating random integers in the range 1..10.");

		int START = 1;
		int END = 10;
		Random random = new Random();
		for (int idx = 1; idx <= 10; ++idx) {
			showRandomInteger(START, END, random);
		}
		log("Done.");
	}

	private static void showRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		// get the range, casting to long to avoid overflow problems
		long range = (long) aEnd - (long) aStart + 1;
		System.out.println("range ::" + range);
		// compute a fraction of the range, 0 <= frac < range
		System.out.println(aRandom.nextDouble());
		long fraction = (long) (range * aRandom.nextDouble());
		System.out.println("fraction ::" + fraction);
		int randomNumber = (int) (fraction + aStart);
		log("Generated : " + randomNumber);
	}

	private static void log(String aMessage) {
		System.out.println(aMessage);
	}
}