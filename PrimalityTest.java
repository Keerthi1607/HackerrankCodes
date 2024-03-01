package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
		/*
		 * double num=Double.parseDouble(n); double fact=0; if(num==1)
		 * System.out.println("not prime"); for(long i=1;i<=num;i++){ if(num%i==0)
		 * fact++; if(fact>3){ System.out.println("not prime"); break; } } if(fact==2)
		 * System.out.println("prime");
		 */
		/*
		 * for(long i=1;i<num;i++) { if(num%i==0) { fact++; } } if(fact==1) {
		 * System.out.println("prime"); }else { System.out.println("not prime"); }
		 */     
        bufferedReader.close();// answer
		/*
		 * BigInteger big=new BigInteger(n); if(big.isProbablePrime(1)) {
		 * System.out.println("prime"); }else { System.out.println("not prime"); }
		 */
    }
}
        

