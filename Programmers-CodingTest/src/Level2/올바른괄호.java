package Level2;

import java.util.Stack;

public class ¿Ã¹Ù¸¥°ýÈ£ {
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
//	        int check = 0;
//	        
//	        if(s.charAt(0) == ')') return false;
//	        
//	        for(int i=0; i<s.length();i++) {
//	        	
//	        	if(s.charAt(i) == '(') {
//	        		check++;
//	        	}else {
//	        		if(check <= 0) return false;
//	        		check--;
//	        	}
//	        }
//	        
//	        if(check != 0) return false;
//	        
	        Stack<Character> st = new Stack<Character>();
	        
	        for(int i=0; i<s.length(); i++) {
	        	char ch = s.charAt(i);
	        	
	        	if(ch=='(') {
	        		st.push(ch);
	        	}else {
	        		if(st.isEmpty()) {
	        			return false;
	        		}
	        		st.pop();
	        	}
	        }
	        
	        if(!st.isEmpty()) return false;
	        
	        return answer;
	    }
	}
}
