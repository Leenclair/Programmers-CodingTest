package Baekjoon;

import java.util.Scanner;

public class _4375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int num=0;
			int cnt = 1;
			
			while(true) {
				num = (num*10) + 1;
				num = num%n;
				if(num == 0) {
					System.out.println(cnt);
					break;
				}
				cnt++;
			}
			
		}
			
		sc.close();
	}
}
