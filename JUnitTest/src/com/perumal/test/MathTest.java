package com.perumal.test;

import com.perumal.calculation.Calculation;

import junit.framework.Test;
import junit.framework.TestCase;

public class MathTest extends TestCase {
	private int value1;
	private int value2;

	public MathTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		value1 = 5;
		value2 = 5;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		value1 = 0;
		value2 = 0;
	}

	public void testAdd() {
		int total = 10;
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}

	public void testFailedAdd() {
		int total = 9;
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}

	public void testSub() {
		int total = 0;
		int sub = Calculation.sub(4, 4);
		assertEquals(sub, total);
	}
	public void testTest() {
		int negativeBet = 1;
		boolean isRoundFinished = true;
		boolean result = com.perumal.test.Test.check(isRoundFinished, negativeBet);
		System.out.println("Result :"+result);
		//assertEquals(sub, total);
	}
}
