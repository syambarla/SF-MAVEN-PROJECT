package salesforce.cicd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTect {
	
	MyCalc calc = new MyCalc();

	@Test
	public void testSum() {		
		assertEquals(70, calc.sum(50, 20));		
	}
	@Test
	public void testDiff() {		
		assertEquals(30, calc.diff(50, 20));		
	}

}
