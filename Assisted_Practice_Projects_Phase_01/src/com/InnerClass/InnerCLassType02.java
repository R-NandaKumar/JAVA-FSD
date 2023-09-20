package com.InnerClass;


	class OuterClass1 {
		  int x = 10;

		  class InnerClass {
		    public int myInnerMethod() {
		      return x;
		    }
		  }
		}

		public class InnerCLassType02 {
		  public static void main(String[] args) {
		    OuterClass1 myOuter = new OuterClass1();
		    OuterClass1.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
		  }
		}

