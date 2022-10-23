package Level1;

public class ¾à¼öÀÇ°³¼ö¿Íµ¡¼À {
	static class Solution {
	    public int solution(int left, int right) {
	    	int answer = 0;
	        
	        for(int i = left; i <= right; i++) {
	            int cnt = 0;
	            
	            for(int j = 1; j <= i; j++) {
	                if(i % j == 0) cnt++;
	            }
	            
	            if(cnt % 2 == 0) answer += i;
	            else answer -= i;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = sol.solution(13, 17);
		System.out.println(answer);
	}
}
