package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		for (int i = 0; i < N; i++) {
			int sizeOfArray = sc.nextInt();
			List<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < sizeOfArray; j++) {
				array.add(sc.nextInt());
			}
			arrays.add(array);
		}
		int Q = sc.nextInt();
		for(int i=0;i<Q;i++) {
			int q1=sc.nextInt();
			int q2=sc.nextInt();
			try {
		System.out.println(arrays.get(q1-1).get(q2-1))	;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR!");
		}
		//System.out.println(arrays);
			/*5
			5 41 77 74 22 44
			1 12
			4 37 34 36 52
			0
			3 20 22 33
			5
			1 3
			3 4
			3 1
			4 3
			5 5*/
			/*
			 74
52
37
ERROR!
ERROR!
			 */
		}
	}
}