package test;

import org.junit.Before;
import org.junit.Test;

import impl.HashUtilities;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

	@Test
	public void testHashes() {
		for (int i = 0; i < 2000; i++) {
			int hash = HashUtilities.shortHash(i);
			assertTrue(hash >= 0);
			assertTrue(hash < 1000);
		}
	}

}
