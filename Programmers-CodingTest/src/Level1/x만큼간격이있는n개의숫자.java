package Level1;

public class x만큼간격이있는n개의숫자 {
	
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        long num = x;

	        for(int i=0;i<answer.length;i++) {
	        	answer[i] = num*(i+1);
	        }

	        return answer;
	    }
	}
	
	
	
}
