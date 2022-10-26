package Level1;

public class 최대공약수와최소공배수 {
	static class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        answer[0] = gcd(n,m);
	        answer[1] = lcm(n,m);
	        
	        return answer;
	    }
	    
	    static int gcd(int a, int b) {
	    	while(b!=0) {
	    		int r = a%b;
	    		a=b;
	    		b=r;
	    	}
	    	return a;
	    }
	    
	    static int lcm(int a, int b) {
	    	return a*b/gcd(a,b);
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] ans = sol.solution(3, 5);
		System.out.println("ans[0]="+ans[0] +", ans[1]="+ ans[1]);
	}
}
