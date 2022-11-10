package Baekjoon;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int cnt = 0;
		int origin = num;

		while (true) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;

			if (origin == num) {
				break;
			}
		}
		
		System.out.println(cnt);

	}
}
