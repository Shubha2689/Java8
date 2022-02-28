package io.java.brains.localdate;

import java.util.function.Predicate;

interface Print {
	public void printName();
	 
 }

public class Simple  {
	
	static int a=10;
	static int b= 20;

	public static void main(String[] args) {
		
		
		if(a<=b) {
			System.out.println("a is less then b then print A");
			
		}else if(a>=b) {
			System.out.println(" is less then a");
		}
		
		
		String name ="ankur";
		
		Predicate<String> p= p1->(name.equals("ankur"));
		
		System.out.println(p.test(name));
		
		
		Addition a = new Addition();
		int c = a.add(1, 3);
		
		String fullname =a.name("shubhangi", "khobare");
		
		System.out.println(fullname);
		
		
		
		};
		
		
		

		
	}


