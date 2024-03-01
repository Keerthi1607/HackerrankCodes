package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		int Q = sc.nextInt();
		String[] a = new String[Q];
		int b[] = new int[Q];
		int c[] = new int[Q];
		int d[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			String s = sc.next();
			a[i] = s;
			if (a[i].equals("Insert")) {
				int index = sc.nextInt();
				b[i] = index;
				int value = sc.nextInt();
				c[i] = value;
			} else if (a[i].equals("Delete")) {
				int del_index = sc.nextInt();
				d[i] = del_index;
			}
		}
		for(int i=0;i<Q;i++) {
			if(a[i].equals("Insert")) {
				list.add(b[i],c[i]);
			}
			else if(a[i].equals("Delete")) {
				list.remove(d[i]);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
