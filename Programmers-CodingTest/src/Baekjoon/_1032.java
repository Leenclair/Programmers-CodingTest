package Baekjoon;

import java.util.Scanner;

public class _1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<arr[0].length(); i++) {
			boolean check = true;
			char ch = arr[0].charAt(i);
			
			for(int j=1; j<n; j++) {
				if(ch!=arr[j].charAt(i)) {
					check = false;
					break;
				}
			}
			
			if(check==true) {
				ans.append(ch);
			}else {
				ans.append('?');
			}
		}
		
		System.out.println(ans.toString());

	}
}
