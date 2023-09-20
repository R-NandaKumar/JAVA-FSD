package com.Maps;

import java.util.*;
public class MapsApp {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Number,String> hm=new HashMap<>();      
	      hm.put(1,"Vishal");    
	      hm.put(2,"Abc");    
	      hm.put(3,"Catie"); 
	      System.out.println(hm.get(1));
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry<Number,String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	      System.out.println("Is Vishal id is 1"+ hm.containsKey(1));
	      System.out.println("Is Catie present in the Collection"+hm.containsValue("Catie"));
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  
	      

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry<Integer,String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      System.out.println(" There are "+ht.size()+"  keys in the Hashtable Collections");
	      
	      //TreeMap
	      System.out.println("\nThe elements of Treemap are ");  
	      
	      Map<String, Integer> map = new TreeMap<>();
	      
	        // Inserting custom elements in the Map
	        // using put() method
	        map.put("vishal", 10);
	        map.put("sachin", 30);
	        map.put("vaibhav", 20);
	  
	        // Iterating over Map using for each loop
	        for (Map.Entry<String, Integer> e : map.entrySet())
	  
	            // Printing key-value pairs
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
	      
	   }  
}


