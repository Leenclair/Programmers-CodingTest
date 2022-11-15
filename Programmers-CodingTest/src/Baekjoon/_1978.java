package Baekjoon;

import java.util.Scanner;

public class _1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int ch = 0;
			int tmp = sc.nextInt();
			for(int j=2; j<=tmp; j++) {
				if(tmp%j==0) ch++;
			}
			if(ch==1) cnt++;
		}
		
		sc.close();
		
		System.out.println(cnt);
	}

}
