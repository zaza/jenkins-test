package com.github.zaza.jenkins;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(new HelloWorld().sayHello());
	}

	String sayHello() {
		return "hello";
	}
}
