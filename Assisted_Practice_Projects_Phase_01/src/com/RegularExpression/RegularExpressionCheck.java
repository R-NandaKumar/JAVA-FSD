package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
class RegularExpressionCheck{

	// Main driver method
	public static void main(String args[])
	{

		// Create a pattern to be searched
		// Custom pattern
		Pattern pattern = Pattern.compile("SimpliLearn");

		// Search above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("SimpliLearn.org");

		while (m.find())
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
		
		System.out.println(Pattern.matches("[a-z]", "m"));
		System.out.println(Pattern.matches("[a-zA-Z]", "L"));
		System.out.println(Pattern.matches("[b-z]?", "a"));
		System.out.println(Pattern.matches("[Learn]*", "Sim"));
		System.out.println(Pattern.matches("\\S+", "i"));
	}
}

