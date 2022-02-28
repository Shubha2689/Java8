package io.java.brains.lambdaExpression;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		//StringLengthLambda stringLength=(s)->s.length();
		//System.out.println(stringLength.getLength("hello"));
		
		
		prinLambda(s->s.length());
	
		
	

	}
	
	public static void prinLambda(StringLengthLambda l) {
		System.out.println(l.getLength("welcome"));
		
		
		
	}
	
	interface StringLengthLambda {
		
		int getLength(String s);
		
	}

}
