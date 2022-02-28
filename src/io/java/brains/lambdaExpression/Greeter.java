package io.java.brains.lambdaExpression;

// 2 type of impplimation

public class Greeter {

	public void greet(Greeting greeting) {

		greeting.perform();

	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		HelloWorldGreeting hw = new HelloWorldGreeting();

		greeter.greet(hw);

		Greeting greeting = () -> System.out.println("welcome");

		greeting.perform();

		Greeting innereGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("to home");

			}
		};
	     greeter.greet(innereGreeting);
	     greeter.greet(greeting);
		

	}

}
