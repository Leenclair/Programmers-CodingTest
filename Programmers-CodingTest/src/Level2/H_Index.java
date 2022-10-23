package Level2;

import java.util.Arrays;

public class H_Index {
	class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        int tmp = 0;
	        
	        Arrays.sort(citations);
	        
	        for(int i=0; i<citations.length; i++) {
	        	tmp = citations.length-i;
	        	
	        	if(citations[i]>=tmp) {
	        		answer = tmp;
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
	}
}
