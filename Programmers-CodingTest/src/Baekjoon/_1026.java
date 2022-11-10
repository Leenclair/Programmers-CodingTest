package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arrA = new int[n];
		int[] arrB = new int[n];

		for(int i=0; i<n; i++) {
			arrA[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++) {
			arrB[i] = sc.nextInt();
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			ans += arrA[i] * arrB[n-i-1];
		}
		
		System.out.println(ans);
	}
}
