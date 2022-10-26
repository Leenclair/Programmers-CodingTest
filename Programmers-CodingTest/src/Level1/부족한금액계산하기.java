package Level1;

public class 부족한금액계산하기 {
	static class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = 0;
	        long sum = 0;
	        
	        for(int i=1; i<=count; i++) {
	        	sum += price*i;
	        }
	        
	        if(sum > money) {
        		answer = Math.abs(sum-money);
        	}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		long ans = sol.solution(3, 20, 4);
		System.out.println(ans);
	}
}
