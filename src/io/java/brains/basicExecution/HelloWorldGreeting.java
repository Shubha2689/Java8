package io.java.brains.basicExecution;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello world");
	}
}
