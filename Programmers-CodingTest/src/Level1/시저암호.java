package Level1;

public class 시저암호 {
	static class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        
	        char[] ch = s.toCharArray();
	        for(int i=0; i<ch.length; i++) {
	        	if(ch[i]>='a' && ch[i]<='z') {
	        		if(ch[i]+n > 'z') {
	        			ch[i]=(char)(ch[i]-26+n);
	        			answer +=ch[i];
	        		}else{
	        		ch[i] = (char)(ch[i]+n);
	        		answer +=ch[i];
	        		}
	        	}else if(ch[i]>='A' && ch[i]<='Z') {
	        		if(ch[i]+n > 'Z') {
	        			ch[i]=(char)(ch[i]-26+n);
	        			answer +=ch[i];
	        		}else{
	        		ch[i] = (char)(ch[i]+n);
	        		answer +=ch[i];
	        		}
	        	}else if(ch[i]==' ') {
	        		ch[i] = ' ';
	        		answer +=ch[i];
	        	}
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str = "a B z";
		String ans = sol.solution(str, 4);
		System.out.println(ans);
	}
}
