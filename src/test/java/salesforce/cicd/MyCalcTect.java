package salesforce.cicd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class MyCalcTect {
	
	MyCalc calc = new MyCalc();

	@Test
	public void testSum() {		
//		assertEquals(70, calc.sum(50, 20));		
		assertEquals(30, calc.diff(50, 20));
	}

}
