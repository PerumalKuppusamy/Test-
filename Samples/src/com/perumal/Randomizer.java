package com.perumal;

/**
 * We all know that random number generators aren't truly random. This class
 * generates random numbers a bit more randomly.
 */
public final class Randomizer {
	private static final char[] digits = { '0', '1', '2', '3', '4', '5', '6','7', '8', '9' };

	// Allow this to be instantiated in parallel in multiple threads
	public Randomizer() {
	}

	public final double random() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getRandomDigitString());
		sb.append(".");
		sb.append(getRandomDigitString());
		return Double.parseDouble(sb.toString());
	}

	private String getRandomDigitString() {
		final StringBuilder sb = new StringBuilder();
		int n = getRandomNumberOfDigits();
		for (int i = 0; i < n; i++) {
			sb.append(getRandomDigit());
		}
		if (n == 0) {
			sb.append("0");
		}
		return sb.toString();
	}

	private char getRandomDigit() {
		return digits[(int) (Math.random() * 10)];
	}

	private int getRandomNumberOfDigits() {
		return (int) ((Math.random() * 100) * Math.random());
	}
}
