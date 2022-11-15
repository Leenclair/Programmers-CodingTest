package Baekjoon;

import java.util.Scanner;

public class _6588 {
	public static final int MAX = 1000000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean[] isPrime = new boolean[MAX+1];
		for(int i=2; i<=MAX; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i<=MAX; i++) { //�����佺�׳׽��� ü�� �Ҽ�����
			for(int j=i*2; j<=MAX; j+=i) {
				if(!isPrime[j]) continue;
				isPrime[j] = false;
			}
		}
		
		while(true) {
			int n = sc.nextInt();
			boolean ch = false;
			if(n ==0) break;
			for(int i=2; i<=n/2; i++) {
				if(isPrime[i] && isPrime[n-i]) {
					System.out.println(n + " = "+i+" + "+(n-i));
					ch=true;
					break;
				}
			}
			if(!ch) System.out.println("Goldbach's conjecture is wrong.");
		}
	}
}
