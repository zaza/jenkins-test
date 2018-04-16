package com.github.zaza.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void sayHello() throws Exception {
		assertEquals("hello", new HelloWorld().sayHello());
	}
}
