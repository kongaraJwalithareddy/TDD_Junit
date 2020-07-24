import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
class RemoveA {
	/*
	 * TODO List for REMOVING 'A' IF PRESENT IN FIRST TWO CHARCTERS
	 * 1 chars : 	 "ABCD" => "BCD"
	 * 2 chars :     "AABB" => "BB"
	 * 3 chars :     "AAAB" => "AB"
	 * 4 chars :     "AAAABB" => "AABB"
	 * n chars :     "AAAAAAB" => "AAAAB"
	 * empty   :     "" => ""
	 */
	Remove r;
	@BeforeEach
	void setUp()
	{
		r=new Remove();
	}
	@Test
	void test1Chars() {
		assertEquals("BCD",r.remove("ABCD"));
		assertEquals("",r.remove("A"));
		assertEquals("B",r.remove("B"));
	}
	@Test
	void test2Chars() {
		assertEquals("BB",r.remove("AABB"));
		assertEquals("BCD",r.remove("BACD"));
	}
	@Test
	void test3Chars() {
		assertEquals("AB",r.remove("AAAB"));
		assertEquals("BBB",r.remove("ABBB"));
	}
	@Test
	void test4Chars() {
		assertEquals("AABB",r.remove("AAAABB"));
		assertEquals("BAABB",r.remove("ABAABB"));
	}
	@Test
	void testnChars() {
		assertEquals("AAAABB",r.remove("AAAAAABB"));
		assertEquals("BBBBBBBB",r.remove("BBBBBBBB"));
	}
	@Test
	void testEmptyChars() {
		assertEquals("",r.remove(""));
	}
}