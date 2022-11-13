package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}
