package javafortesters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerExamples_Test {

	@Test
	public void integerExploration() {
		Integer four = new Integer("4");
		//assertEquals("Should return int", 4, four.intValue());
		
		Integer six = 6;
		//assertEquals("integer gets autoboxed to object", 6, six.intValue());
		
		//assertEquals("static method", 7, Integer.parseInt("7"));
		
		//assertEquals("hex string", "b", Integer.toHexString(11));
		
		assertEquals("max value", 2147483647, Integer.MAX_VALUE);
	}
}
