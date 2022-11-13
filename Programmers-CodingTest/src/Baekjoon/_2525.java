package Baekjoon;

import java.util.Scanner;

public class _2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int n = sc.nextInt();
		
		sc.close();
		
		int total = hour * 60 + min + n;
		hour = (total / 60)%24;
		min = total % 60;
		
		System.out.println(hour + " " + min);
	}
}
