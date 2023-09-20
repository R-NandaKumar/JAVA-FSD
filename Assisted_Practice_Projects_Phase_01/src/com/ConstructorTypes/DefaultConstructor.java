package com.ConstructorTypes;


class DefaultConstructor {

	  String a="This is Default Constructor";
	  boolean b;

	  public static void main(String[] args) {

	    // A default constructor is called
		  DefaultConstructor obj = new DefaultConstructor();

	    System.out.println("Default Value:");
	    System.out.println(obj.a);
	    System.out.println("b = " + obj.b);
	  }
	}
