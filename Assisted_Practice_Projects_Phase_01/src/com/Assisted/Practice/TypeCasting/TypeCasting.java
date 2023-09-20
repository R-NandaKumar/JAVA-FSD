package com.Assisted.Practice.TypeCasting;


public class TypeCasting{
	   public static void main(String[] args)
	   {
		   TypeCastingApp ic = new TypeCastingApp();
		   ic.ImplicitTypeCasting();
		   ic.NarrowingTypeCasting();
	}
}
class TypeCastingApp {
	
	
		public void  ImplicitTypeCasting()
		{  
			   
			      byte p = 12;  
			      System.out.println("byte value : "+p);  
			      // Implicit Typecasting  
			      short q = p;  
			      System.out.println("short value : "+q);  
			      int r = q;  
			      System.out.println("int value : "+r);  
			      long s = r;  
			      System.out.println("long value : "+s);  
			      float t = s;  
			      System.out.println("float value : "+t);  
			      double u = t;  
			      System.out.println("double value : "+u);  
			   }  
			   
			   public void  NarrowingTypeCasting()
			   {  
			   double d = 166.66;  
			   //converting double data type into long data type  
			   long l = (long)d;  
			   //converting long data type into int data type  
			   int i = (int)l;  
			   System.out.println("Before conversion: "+d);  
			   System.out.println("After conversion into long type: "+l);  
			   System.out.println("After conversion into int type: "+i);
			 //converting int data type into byte data type
			   int u = 190; 
			   byte n = (byte)u;  
			   System.out.println("Before conversion: "+u); 
			   System.out.println("After conversion into byte type: "+n);  
			   
			   
			   }  
			

			
			

	}


