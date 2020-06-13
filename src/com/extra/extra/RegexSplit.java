package com.extra.extra;
import java.io.*;
import java.util.*;

public class RegexSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        // Write your code here.
        //Explore StringTokenizer
        String[] arr = s.split("[ !,?._'@]+");
        if(arr.length == 1 && arr[0].equals("")) {
        	System.out.println("0");
        } else {
	        System.out.println(arr.length);
	        for(String word: arr){
//	        	if(!word.equals("")) {
	        		System.out.println(word);
//	        	}
	        }
        }
        scan.close();
    }
}
