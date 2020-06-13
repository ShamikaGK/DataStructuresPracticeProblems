package com.extra.extra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        //String regex = "/* Write a RegEx matching repeated words here. */";
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        //Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/);
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        System.out.println();
        while (numSentences > 0) {
            String input = in.nextLine();
            
        //    "\\b(\\w+)(\\s+\\1\\b)+";
            // Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                //input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
            numSentences--;
        }
        
        in.close();
    }
}
