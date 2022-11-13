package Baekjoon;

import java.util.Scanner;

public class _2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int cnt = 1;
		int idx = 1;
		
		for(int i=1 ; i<arr.length; i++) {
			cnt++;
			
			if(arr[i] > max) {
				max = arr[i];
				idx = cnt;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
	}
}
