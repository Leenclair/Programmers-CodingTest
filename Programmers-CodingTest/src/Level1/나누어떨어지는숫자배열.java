package Level1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        int cnt = 0;
	        
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i] % divisor == 0) {
	        		cnt++;
	        	}
	        }
	        
	        int[] answer = new int[cnt];
	        cnt=0;

	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i] % divisor == 0) {
	        		answer[cnt]=arr[i];
	        		cnt++;
	        	}
	        }

	        Arrays.sort(answer);
	        
	        if(answer.length == 0) {
        		answer = new int[1];
	        	answer[0] = -1;
        	}
	        
	        return answer;
	    }
	}
	
}
