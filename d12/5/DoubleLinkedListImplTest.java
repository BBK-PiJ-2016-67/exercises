package test;

import org.junit.Before;
import org.junit.Test;

import spec.List;
import impl.DoubleLinkedListImpl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DoubleLinkedListImplTest {

	DoubleLinkedListImpl list;

	@Before
	public void setUp() {
		list = new DoubleLinkedListImpl();
	}

	@Test
	public void testList() {
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		list.remove(0);
		list.remove(99);
		list.prettyPrint();
	}

}
