package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class againTest {
	static class Solution {
		public int[] solution(int[] numbers) {
			int[] answer = {};

			ArrayList<Integer> list = new ArrayList<Integer>();

			for(int i=0; i<numbers.length; i++) {
				for(int j=i+1; j<numbers.length; j++) {
					int sum = numbers[i] + numbers[j];
						if(!list.contains(sum)) list.add(sum);
				}
			}
			
			answer = new int[list.size()];
			
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
			
			Arrays.sort(answer);

			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {2,1,3,4,1};
		int[] ans = sol.solution(test);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}