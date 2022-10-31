package Level1;

public class 최소직사각형 {
	static class Solution {
	    public int solution(int[][] sizes) {
	        int answer = 0;
	        int max1 = 0;
	        int max2 = 0;
	        
	        for(int i=0; i<sizes.length; i++) {
	        	int x = Math.max(sizes[i][0], sizes[i][1]);
	        	int y = Math.min(sizes[i][0], sizes[i][1]);
	        	
	        	max1 = Math.max(max1, x);
	        	max2 = Math.max(max2, y);
	        }
	        
	        answer = max1*max2;
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] test = {{60,50},{30,70},{60,30},{80,40}};
		int ans = sol.solution(test);
		System.out.println(ans);
	}
}
