package Level2;

public class N개의최소공배수 {
	class Solution {
	    public int solution(int[] arr) {

	    	int lcm = arr[0];
	        for(int i=0; i<arr.length; i++) {
	        	lcm = lcm(lcm, arr[i]);
	        }
	        
	        return lcm;
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
}
