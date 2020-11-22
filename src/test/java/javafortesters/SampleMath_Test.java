package javafortesters;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class SampleMath_Test {
	
	@Test
	public void printMyName() {
		System.out.println("Tester");
	}
	@Test
	public void checkSubtraction() {
		SampleMath sp = new SampleMath(10, 8);
		assertEquals("I expect 10-8=2", 2, sp.subtractNumbers());
	}
	@Test
	public void checkMultiplication() {
		SampleMath sp = new SampleMath(10, 8);
		assertEquals("I expect 10*8=80", 80, sp.multiplyNumbers());
	}
	
	public void checkFourByTwoIsTwo() {
		int answer = 4/2;
		assertEquals(2, answer);
	}
	
}
