package test;

import org.junit.Before;
import org.junit.Test;

import spec.Stack;
import impl.StackImpl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StackImplTest {

	Stack stack;

	@Before
	public void setUp() {
		stack = new StackImpl();
	}

	@Test
	public void testStack() {
		assertEquals(0, stack.size());
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		assertEquals(99, stack.peek());
		assertEquals(100, stack.size());
		assertEquals(99, stack.pop());
		assertEquals(99, stack.size());
	}

}
