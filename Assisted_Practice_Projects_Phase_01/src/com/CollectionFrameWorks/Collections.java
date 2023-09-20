package com.CollectionFrameWorks;
import java.util.*;
public class Collections {

	public static void main(String[] args) {
		
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Hello");
	      city.add("World !");
	      System.out.println(city);
	      city.clear();
	      city.isEmpty();
	      
	      System.out.println("After Removing the Collection is : " + city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> vec = new Vector<String>();
	      vec.add("Hello"); 
	      vec.addElement("This is Vector CollectionsFramework"); 
	      System.out.println(vec.firstElement());
	      System.out.println(vec.lastElement());
	      System.out.println(vec.capacity());
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	
	      
	    Iterator<String> itr1 =names.descendingIterator();  
	      while(itr1.hasNext()){  
	      System.out.println(itr1.next());}
	      
	     Iterator<String> itr2 =names.listIterator();  
	      while(itr2.hasNext()){  
	       System.out.println(itr2.next());}
	   
	      Iterator<String> itr =names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());}  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println("Is it HashSet Empty or Full : "+set.isEmpty());
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2.size());
	      }}
