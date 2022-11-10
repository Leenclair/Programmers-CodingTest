package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
//		int min = arr[0], max = arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(min>arr[i]) min = arr[i];
//			if(max<arr[i]) min = arr[i];
//		}
		
		int min = arr[0];
		int max = arr[n-1];
		
		System.out.println(max * min);
	}
}
