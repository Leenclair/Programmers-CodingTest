package Level1;

public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        
	        for(int i=0; i<n; i++) {
	        	answer += i%2==0? "��" : "��";
	        }
	        
	        return answer;
	    }
	}
}
