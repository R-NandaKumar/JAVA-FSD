package com.Methods;

//Methods With No input and No Output
public class Type01 {

	public static void main(String[] args)
	{
		Calculator calci = new Calculator();
		calci.add();

	}
}

class Calculator
{
	int x,y;
	void add()
	{
		String s1= "Method with No input ";
		String s2 = "And No  Output";
		String s3 = s1+s2;
		System.out.println(s3);
	}
}
