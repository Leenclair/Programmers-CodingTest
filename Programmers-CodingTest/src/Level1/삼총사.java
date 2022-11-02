package Level1;


public class ªÔ√—ªÁ {
	static class Solution {
	    public int solution(int[] number) {
	        int answer = 0;
	        
	        for(int i=0; i<number.length; i++) {
	        	for(int j=i+1; j<number.length;j++) {
	        		for(int k=j+1; k<number.length;k++) {
	        			int tmp = number[i]+number[j]+number[k];
	        			if(tmp==0) {
	        				System.out.println(""+number[i]+number[j]+number[k]);
	        				System.out.println(tmp);
	        				answer++;
	        			}
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {-2, 3, 0, 2, -5};
		int ans = sol.solution(test);
		System.out.println(ans);
	}
}
