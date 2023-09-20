package com.Methods;

public class Type02 {

	public static void main(String[] args) {
		CalculatorApp calci = new CalculatorApp();
		String  res =calci.concate();
		System.out.println(res);
	
	}
}
class CalculatorApp 
{
	int x,y;
	String  concate()
	{
		String s1= "Method with No Input";
		String s2 = "But, Gives Output";
		String s3 =s1+s2;
		return s3;
	}
}

