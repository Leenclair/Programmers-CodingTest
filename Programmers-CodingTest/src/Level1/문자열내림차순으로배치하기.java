package Level1;

import java.util.Arrays;

public class ���ڿ������������ι�ġ�ϱ� {
	static class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] c = s.toCharArray();
	        
	        Arrays.sort(c);
	        
	        for(int i=c.length-1; i>=0; i--) {
	        	answer += c[i];
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = sol.solution("Zbcdefg");
		
		System.out.println(answer);
	}
}
