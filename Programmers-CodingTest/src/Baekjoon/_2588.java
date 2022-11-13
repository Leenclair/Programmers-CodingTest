package Baekjoon;

import java.util.Scanner;

public class _2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int num1 = a * (b/100);
		b = b%100;
		int num2 = a * (b/10);
		b = b%10;
		int num3 = a* (b/1);
		
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
		System.out.println(num3 + num2*10 + num1*100);
	}
}
