package Baekjoon;

import java.util.Scanner;

public class _2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for(int i=n; i>=1; i--) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
