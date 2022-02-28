package io.java.brains.lambdaExpression;

interface Add{  
    public void addition(int a,int b);  
}  
  

public class ForPractEx {

	public static void main(String[] args) {

		 
//	        int a=10;
//	        int b=10;
	          
	        
	        Add a2=(a,b)->{  
	            System.out.println(a+b);  
	        };  
	        a2.addition(1, 3);;  
	    }  

}
