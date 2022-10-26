package Level1;

public class 이상한문자만들기 {
	static class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        String[] str=s.split("");
	        int idx = 0;
	        
	        for(int i=0; i<str.length; i++) {
	        	if(str[i].equals(" ")) {
	        		idx = 0;
	        	}else if(idx%2==0) {
	        		str[i]=str[i].toUpperCase();
	        		idx++;
	        	}else if(idx%2!=0) {
	        		str[i]=str[i].toLowerCase();
	        		idx++;
	        	}
	        	answer += str[i];
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str = sol.solution("try hello world");
		System.out.println(str);
	}
}
