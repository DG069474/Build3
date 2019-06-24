import sourcefiles;
import org.junit.Test;

import static org.junit.Assert.*;

public class testAddsNeg {
	@Test
	public void testAdd1Plus1() {
		int answer = 2;
		
		AddsNum add = new AddsNum(-2,4);
		assertEquals(answer, add.adds());
	}
	
	@Test
	public void testAddwrong() {
		int answer = 1;
		
		AddsNum add = new AddsNum(1,1);
		assertFalse(answer == add.adds());
	}
}
