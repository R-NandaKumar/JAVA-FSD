package com.ConstructorTypes;


class NoArgConstructor {
	  String name;

	  // public constructor
	  public NoArgConstructor() {
	    name = "Simplilearn";
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // object is created in another class
		  NoArgConstructor obj = new NoArgConstructor();
	    System.out.println("Company name = " + obj.name);
	  }
	}
