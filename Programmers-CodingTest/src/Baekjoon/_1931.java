package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][2];

		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, (o1, o2)->{
			if(o1[1]==o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});
		
		int cnt=0, end=0;
		
		for(int i=0; i<arr.length; i++) {
			if(end <= arr[i][0]) {
				end = arr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
