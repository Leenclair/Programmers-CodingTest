package Baekjoon;

import java.util.Scanner;

public class _11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for(int i= arr.length-1; i>=0; i--) {
			if(arr[i]<=b) {
				cnt += (b/arr[i]);
				b = b%arr[i];
			}
		}
		
		System.out.println(cnt);
	}
}
