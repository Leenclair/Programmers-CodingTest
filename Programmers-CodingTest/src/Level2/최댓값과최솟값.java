package Level2;

public class �ִ񰪰��ּڰ� {
	
	class Solution {
	    public String solution(String s) {
	        
	        String[] newS = s.split(" ");
	        
	        int min, max, n;
	        min = max = Integer.parseInt(newS[0]);
	        for(int i=1;i<newS.length;i++) {
	        	n = Integer.parseInt(newS[i]);
	        	if(min > n) min = n;
	        	if(max < n) max = n;
	        }
	        
	        
	        return min + " " + max;
	    }
	}
	
}
