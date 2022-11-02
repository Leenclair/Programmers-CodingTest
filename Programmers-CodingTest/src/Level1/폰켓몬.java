package Level1;

import java.util.ArrayList;

public class ÆùÄÏ¸ó {
	static class Solution {
	    public int solution(int[] nums) {
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int size = nums.length/2;

	        for(int i=0; i<nums.length; i++) {
	        	if(!list.contains(nums[i])) {
	        		list.add(nums[i]);
	        	}
	        }
	        
	        int answer = list.size();
	        
	        if(list.size() > size) {
	        	answer = size;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {3,1,2,3};
		int ans = sol.solution(test);
		System.out.println(ans);
	}
}
