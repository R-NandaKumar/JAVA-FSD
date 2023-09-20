package com.Methods;

//Method with Input and No Output
public class Type03 {

	public static void main(String[] args) {
		
		Type03App t3=new Type03App();
		String p="With Input";
		String q= "  without  Output";
		t3.concate(p,q);
			
	}
}
class Type03App
{
	void concate(String p,String q)
	{
		String s =p+q;
		System.out.println(s);
	}
}