package test;

import org.junit.Before;
import org.junit.Test;

import impl.Utils;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class UtilsTest {

	Utils utils;

	@Before
	public void setUp() {
		utils = new Utils();
	}

	@Test
	public void testGetInitials() {
		String initials = utils.getInitials("Lucas Gordon");
		assertEquals(initials, "LG");
	}

	@Test
	public void testGetInitialsTwoSpaces() {
		String initials = utils.getInitials("Lucas  Gordon");
		assertEquals(initials, "LG");
	}

}
