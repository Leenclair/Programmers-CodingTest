package Level2;

public class �ùٸ���ȣ {
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        int check = 0;
	        
	        if(s.charAt(0) == ')') return false;
	        
	        for(int i=0; i<s.length();i++) {
	        	
	        	if(s.charAt(i) == '(') {
	        		check++;
	        	}else {
	        		if(check <= 0) return false;
	        		check--;
	        	}
	        }
	        
	        if(check != 0) return false;
	        
	        return answer;
	    }
	}
}
