import org.junit.Test;

import static org.junit.Assert.*;

public class testAddsNeg {
	@Test
	public void testAdd1Plus1() {
		int answer = 2;
		
		AddsNum add = new AddsNum();
		assertEquals(answer, add.adds(-2,4));
	}
	
	@Test
	public void testAddwrong() {
		int answer = 1;
		
		AddsNum add = new AddsNum();
		assertFalse(answer == add.adds(1,1));
	}
}
