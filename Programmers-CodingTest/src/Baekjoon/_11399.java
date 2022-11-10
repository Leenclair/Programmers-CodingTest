package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0, total=0;
		
		for(int i=0; i<arr.length; i++) {
			total += sum + arr[i];
			sum += arr[i];
		}
		
		System.out.println(total);
	}
}
