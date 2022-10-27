package Level1;

import java.util.Arrays;

public class ¿¹»ê {
	static class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        int cnt=0;
	        
	        for(int i=0; i<d.length; i++) {
	        	cnt += d[i];
	        	if(cnt > budget) {
	        		break;
	        	}
	        	answer++;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] d = {1,3,2,5,4};
		int ans = sol.solution(d, 9);
		System.out.println(ans);
	}
}
