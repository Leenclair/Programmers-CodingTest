package Baekjoon;

import java.util.Scanner;

public class _10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";

		for(int i=0; i<n; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N%H==0) {
				ans = H*100+(N/H)+"";
			}else {
				ans = (N%H)*100+((N/H)+1)+"";
			}
			System.out.println(ans);
		}
	}
}
