package io.java.brains.basicExecution;

public class Greeter {
	
	//Creating interface object greeting
	   public void geet( Greeting greeting) {
		   greeting.perform();
	}

	public static void main(String[] args) {
		
	Greeter greeter1= new Greeter();
	HelloWorldGreeting hw= new HelloWorldGreeting();
	
	greeter1.geet(hw);

	}
}
