package io.java.brains.unit1Examples;

public class ClosuresExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		doprocess(a,i-> System.out.println(i+b));

	}
	
	public static void doprocess(int i,Process p) {
		p.process(i);
		
	}

	interface Process{
		void process(int i);
	}
}
