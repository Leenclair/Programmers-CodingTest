package Baekjoon;

import java.util.Scanner;

public class _2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int cnt = 0;
		
		while(true) {
			if(i%5==0) {
				cnt += i/5;
				System.out.println(cnt);
				break;
			}else {
				i -= 3;
				cnt++;
			}
			
			if(i<0) {
				System.out.println(-1);
				break;
			}
		}
	}
}
