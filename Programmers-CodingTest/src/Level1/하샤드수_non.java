package Level1;

public class �ϻ����_non {
	class Solution {
	    public boolean solution(int x) {
	        int i = 0;
	        int n=x;
	        
	        while(n != 0) {
	        	i += n%10;
	        	n /= 10;
	        }
	        
	        return x % i == 0 ? true : false;
	    }
	}
}
