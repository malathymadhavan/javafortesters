package javafortesters;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class MyFirstTest {
	
	@Test
	public void ATestMethod() {
		Assert.assertTrue(true);
	}
	@Test
	public void checkSubtraction() {
		Sample sp = new Sample("MM",10, 8);
		int answer = sp.subtractNumbers();
		assertEquals("I expect 10-8=2", 2, answer);
	}
	@Test
	public void checkMultiplication() {
		Sample sp = new Sample("MM",10, 8);
		int answer = sp.multiplyNumbers();
		assertEquals("I expect 10*8=80", 80, answer);
	}
	
}
