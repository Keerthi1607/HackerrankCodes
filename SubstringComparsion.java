package com.hackerrank;


import java.util.Scanner;

public class SubstringComparsion {



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] a=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++) {
             a[i]=s.substring(i,i+k);
            }
       for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) >0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
         smallest=a[0];
         largest=a[a.length-1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
