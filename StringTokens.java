package com.hackerrank;

import java.io.*;
import java.util.*;

public class StringTokens  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        List<String> list = new ArrayList<String>();
       
        for (int i = 0; i < s.length()-1; i++) {
            if ((s.charAt(i) > 64 && s.charAt(i) < 91) || (s.charAt(i) > 96 && s.charAt(i) < 123)) {
                a = a + s.charAt(i);
            } else {
                if(!a.equals(""))
                list.add(a);
                a="";
            }
            
        }
        if(!a.equals(""))
        list.add(a);
        System.out.println(list.size());
        //System.out.println(list);
        for(int i=0;i<list.size();i++) {
    
            System.out.println(list.get(i));
        }
            
    
    }
}

