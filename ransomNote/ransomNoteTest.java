package ransomNote;

import static org.junit.Assert.*;

import org.junit.Test;

public class ransomNoteTest {

	@Test
	public void test1() {

		Solution solucion = new Solution();

		assertFalse(solucion.canConstruct("a", "b"));
	}
	
	@Test
	public void test2() {

		Solution solucion = new Solution();

		assertFalse(solucion.canConstruct("aa", "ab"));
	}
	
	@Test
	public void test3() {

		Solution solucion = new Solution();

		assertTrue(solucion.canConstruct("aa", "aab"));
	}
	
	@Test
	public void test4() {

		Solution solucion = new Solution();

		assertTrue(solucion.canConstruct("aab", "baa"));
	}

}
