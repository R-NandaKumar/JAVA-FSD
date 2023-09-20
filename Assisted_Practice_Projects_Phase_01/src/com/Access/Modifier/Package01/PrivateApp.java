package com.Access.Modifier.Package01;

class PrivateApp
{
public static void main(String args[])
	{
	    A obj = new A();
	    //Cannot Access Private variable in Different class 
	    //obj.display();
	    obj.AccountAccessed=66;
	    //Cannot Access Private Data Members in this class
	    //obj.Account1
		
	}

}
			/*class A which Contain only Private Access Modifier */
		class A
		{
			 int AccountAccessed;
			 private int AccountDenied;
		 private void display()
			{
				System.out.println("Hello World !");
			}
		
		}
