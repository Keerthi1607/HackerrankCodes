package com.hackerrank;

import java.util.*;

/*
 * public class Subarray {
 * 
 * public static void main(String args[]) { Scanner sc = new Scanner(System.in);
 * int N = sc.nextInt(); int arr[] = new int[N]; List<Integer> list = new
 * ArrayList<Integer>();
 * 
 * for (int i = 0; i < N; i++) { arr[i] = sc.nextInt(); } for (int i = 0; i < N;
 * i++) { int sum = arr[i]; if (sum < 0) list.add(arr[i]); for (int j = 0; j <
 * N-1 ; j++) { sum +=arr[j]; if (sum < 0) { list.add(sum); sum=0; } }
 * //System.out.println(list); } System.out.println(list); } }
 */
public class Subarray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			int res=arr[i];
			for(int j=i;j<N-1;j++) {
				if(res<0) 
					list.add(res);
					res=res+arr[j+1];

		}if(res<0)
			list.add(res);
		//System.out.println(list);
	}
		//System.out.println(list);
		System.out.println(list.size());
	}
}