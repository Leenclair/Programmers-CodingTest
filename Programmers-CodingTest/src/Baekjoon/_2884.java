package Baekjoon;

import java.util.Scanner;

public class _2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc. nextInt();
		int b = sc. nextInt();
		sc.close();
		
		int[] ans = {a,b};
		
		if(b>=45) {
			ans[1] = b-45;
		}if(b<45) {
			if(a==0) ans[0] = 24;
			ans[0] = ans[0]-1;
			int tmp = 45 - ans[1];
			ans[1] = 60-tmp;
		}
		
		System.out.println(ans[0]+ " " + ans[1]);
	}
}
