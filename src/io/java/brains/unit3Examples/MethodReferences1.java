package io.java.brains.unit3Examples;


//MethodReferences1::printMessage===()->printMessage()
public class MethodReferences1 {

	public static void main(String[] args) {
		
		Thread th= new Thread(MethodReferences1::printMessage);//()->method()
		th.start();
		

	}
	public static void printMessage() {
		System.out.println("Hello");
	}
	

}
