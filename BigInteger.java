package com.hackerrank;
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class BigInteger{

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			/*
			 * Scanner sc=new Scanner(System.in); BigInteger num1=sc.nextBigInteger();
			 * BigInteger num2=sc.nextBigInteger();
			 * 
			 * BigInteger sum=num1.add(num2); BigInteger product=num1.multiply(num2);
			 * System.out.println(sum); System.out.println(product);
			 */
	    	
	    	Scanner sc=new Scanner(System.in);
	        java.math.BigInteger num1=sc.nextBigInteger();
	        java.math.BigInteger num2=sc.nextBigInteger();
	        
	        java.math.BigInteger sum=num1.add(num2);
	        java.math.BigInteger product=num1.multiply(num2);
	        System.out.println(sum);
	         System.out.println(product);
	        
	    
	    }
	}



