package Level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

	static class Solution {
	    public int[] solution(int []arr) {
	        int[] answer = {};
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int check = -1;
	        for(int i=0; i<arr.length; i++) {
	        	if(check!=arr[i]) {
	        		list.add(arr[i]);
	        		check=arr[i];
	        	}
	        }
	        
	        answer = new int[list.size()];
	        for(int i=0; i<list.size(); i++) {
	        	answer[i]=list.get(i);
	        }

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {4,4,4,3,3};
		int[] arr2=sol.solution(arr);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
