package com.hackerrank;
import java.util.*;

public class JavaMap {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
	 HashMap<String, Integer> m1=new HashMap<>();
	 int n=sc.nextInt();
	 sc.nextLine();
	 for (int i = 0; i < n; i++) {
		 String name = sc.nextLine();
		 Integer num = sc.nextInt() ;
         m1.put(name,num);
         sc.nextLine();	 }
		/*
		 * for (Map.Entry<String,Integer> m : m1.entrySet())
		 * System.out.println(m.getKey() + " " + m.getValue());
		 */
	 while(sc.hasNext()) {
		 String s=sc.nextLine();
		 if(m1.containsKey(s)) {
			 System.out.println(s+"="+m1.get(s));
		 }else
			 System.out.println("Not found");
		 }
     }
}

