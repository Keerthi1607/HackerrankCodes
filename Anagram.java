package com.hackerrank;

import java.util.*;
import java.io.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char Str1[] = a.toCharArray();
		String b = sc.nextLine();
		char Str2[] = a.toCharArray();
	   //getFreq(a);
		HashMap<Character,Integer> s1=getFreq(a);
		HashMap<Character,Integer> s2=getFreq(b);
		//getFreq(b);
		boolean isAnagram=true;
		if(!(s1.equals(s2))) {
			isAnagram=false;
		}
		 Iterator<Map.Entry<Character, Integer>> itr = s1.entrySet().iterator();
		 while(itr.hasNext()) {
			 Map.Entry<Character, Integer> entry=itr.next();
			 if(s2.containsKey(entry.getKey())) {
				 int s2value = s2.get(entry.getKey());
				 if(s2value!=entry.getValue()) {
					 isAnagram=false;
					 break;
				 }
			 }else
				 isAnagram=false;	 
		 }
		 System.out.println(isAnagram? "Anagrams":"Not Anagrams");	 
	}

	public static HashMap<Character, Integer> getFreq(String str) {
		HashMap<Character, Integer> m1 = new HashMap<>();
		str = str.toLowerCase();
		int i, j;
		for (i = 0; i < str.length(); i++) {
			int value = 1;
			Character key = str.charAt(i);
			if (m1.containsKey(key)) {
				value = m1.get(key);
				value++;
				m1.put(key, value);// update the value
			} else {
				m1.put(key, value);
			}
		}
		// System.out.println(m1);
		return m1;
	}

}
