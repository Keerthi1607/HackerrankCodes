package com.hackerrank;

	import java.util.*;
	import java.io.*;
	import java.math.*;

	public class Loop_2{
	    public static void main(String []argh){
	                Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        int a_arr[] = new int[t];
	        int b_arr[] = new int[t];
	        int n_arr[] = new int[t];
	        for (int i = 0; i < t; i++) {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            a_arr[i] = a;
	            b_arr[i] = b;
	            n_arr[i] = n;

	        }
	        in.close();
	        
	        for (int i = 0; i < t; i++) {
	            int c=a_arr[i];
	            for(int j=0;j<n_arr[i];j++) {
	                c=c+(int) ( Math.pow(2, j)*b_arr[i]);
	                System.out.print(c+" ");
	            }
	            System.out.println();
	        }
	    }   
	}

