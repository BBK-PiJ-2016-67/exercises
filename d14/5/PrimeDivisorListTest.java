package test;

import org.junit.Before;
import org.junit.Test;

import impl.PrimeDivisorList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PrimeDivisorListTest {

	PrimeDivisorList list;

	@Before
	public void setUp() {
		list = new PrimeDivisorList();
	}

	@Test
	public void testNull() {
		try {
			list.add(null);
		} catch (Exception e) {
			assertTrue(e instanceof NullPointerException);
			assertEquals("value cannot be null", e.getMessage());
		}
	}

	@Test
	public void testNonPrime() {
		try {
			list.add(10);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals("value must be a prime", e.getMessage());
		}
	}

	@Test
	public void testToString() {
		assertEquals("", list.toString());

		list.add(2);

		assertEquals("2 = 2", list.toString());

		list.add(3);
		list.add(3);

		assertEquals("2 * 3 * 3 = 18", list.toString());

		list.add(7);

		assertEquals("2 * 3 * 3 * 7 = 126", list.toString());
	}

}
