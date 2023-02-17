package romanToInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntegerTest {

	@Test
	public void test1() {
		Solution solucion = new Solution();
		
		assertEquals(3, solucion.romanToInt("III"));
	}
	
	@Test
	public void test2() {
		Solution solucion = new Solution();
		
		assertEquals(58, solucion.romanToInt("LVIII"));
	}
	
	@Test
	public void test3() {
		Solution solucion = new Solution();
		
		assertEquals(27, solucion.romanToInt("XXVII"));
	}
	
	@Test
	public void test4() {
		Solution solucion = new Solution();
		
		assertEquals(1994, solucion.romanToInt("MCMXCIV"));
	}
	
	@Test
	public void test5() {
		Solution solucion = new Solution();
		
		assertEquals(621, solucion.romanToInt("DCXXI"));
	}

}
