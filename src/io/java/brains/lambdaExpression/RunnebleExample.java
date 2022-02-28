package io.java.brains.lambdaExpression;
/*This works becoz Runneble has a single method.if it had more then one method,you could not have
written lambda function of that type */

public class RunnebleExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Print Thread");

			}
		});

		myThread.run();
		
		
//Lambda Thread example
		
		
		Thread MyLambdaTread = new Thread(() -> System.out.println("Print Lambda Thread"));
		MyLambdaTread.run();
	}
}
