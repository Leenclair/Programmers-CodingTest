package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _17425 {
	static final int max = 1000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		long fx[] = new long[max+1];
		long gx[] = new long[max+1];
		
		Arrays.fill(fx, 1); // 모든 자연수에 약수 1 포함됨
		
		for(int i=2; i<fx.length; i++) {
			for(int j=1; i*j<fx.length; j++) {
				fx[i*j] += i;
			}
		}
		
		for(int i=1; i<gx.length; i++) {
			gx[i] = gx[i-1] + fx[i];
		}
		
		int cnt = Integer.parseInt(br.readLine());
		while(cnt --> 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(gx[n]).append("\n");
		}
		System.out.println(sb);
	}
}
