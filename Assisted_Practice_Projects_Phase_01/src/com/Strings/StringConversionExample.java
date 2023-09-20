package com.Strings;

public class StringConversionExample {
    public static void main(String[] args) {
        // Create a string
        String originalString = "Simpli, Learn!";
        
        // Convert to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);
        
        // Convert to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);
        
        // Display the original string
        System.out.println("Original String: " + originalString);
        
        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer.toString());
        
        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}
