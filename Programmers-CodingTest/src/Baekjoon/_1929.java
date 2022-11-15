package Baekjoon;

import java.util.Scanner;

public class _1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=a; i<=b; i++) {
			boolean bool = true;
			if(i==1) bool = false;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					bool = false;
					break;
				}
			}
			if(bool) sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
