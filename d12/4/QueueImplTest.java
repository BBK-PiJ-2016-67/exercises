package test;

import org.junit.Before;
import org.junit.Test;

import spec.Queue;
import impl.QueueImpl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class QueueImplTest {

	Queue queue;

	@Before
	public void setUp() {
		queue = new QueueImpl();
	}

	@Test
	public void testQueue() {
		assertEquals(0, queue.size());
		for (int i = 0; i < 100; i++) {
			queue.add(i);
		}
		assertEquals(100, queue.size());
		assertEquals(0, queue.remove());
		assertEquals(99, queue.size());
	}

}
