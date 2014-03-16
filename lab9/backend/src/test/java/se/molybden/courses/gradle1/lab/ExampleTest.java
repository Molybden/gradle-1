package se.molybden.courses.gradle1.lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest extends Example {

	@Test
	public void testMethod() {
		assertEquals("Wrong result from method()",new Example().method(), "text");
	}

}
