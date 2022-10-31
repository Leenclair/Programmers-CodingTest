package Level2;

import java.util.Stack;

public class 짝지어제거하기 {
	static class Solution
	{
	    public int solution(String s)
	    {
	        int answer = -1;
	        
	        Stack<Character> stack = new Stack<Character>();
	        for(int i=0; i<s.length(); i++) {
	        	char ch = s.charAt(i);
	        	
	        	if(!stack.isEmpty() && stack.peek() == ch) stack.pop();
	        	else stack.push(ch);
	        }
	        
	        answer = stack.isEmpty() ? 1 : 0;

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int ans = sol.solution("baabaa");
		System.out.println(ans);
	}
}
