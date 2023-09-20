package com.Methods;

public class Type04 {

	public static void main(String[] args) 
	{
		Type04App t4 = new Type04App();
		String p="With Input";
		String q = " and With Output";
		 String recieve = t4.Concate(p,q);
		 System.out.println(recieve);
		}
}
class Type04App
{
	String p,q;
	String Concate(String p,String q)
	{
		String c = p+q;
		return c;
	}
}