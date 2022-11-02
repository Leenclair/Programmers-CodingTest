package Level1;

import java.util.ArrayList;

public class 모의고사 {
	static class Solution {
		public int[] solution(int[] answers) {
			int[] answer = {};

			int[] p1 = {1, 2, 3, 4, 5};
			int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
			int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

			int p1_ans=0, p2_ans=0, p3_ans=0; 

			for(int i=0; i<answers.length; i++) {
				if(p1[i % p1.length] == answers[i]) p1_ans++;
				if(p2[i % p2.length] == answers[i]) p2_ans++;
				if(p3[i % p3.length] == answers[i]) p3_ans++;
			}

			int max = Math.max(Math.max(p1_ans, p2_ans), p3_ans);

			ArrayList<Integer> list = new ArrayList<Integer>();

			if(max == p1_ans) list.add(1);
			if(max == p2_ans) list.add(2);
			if(max == p3_ans) list.add(3);

			answer = new int[list.size()];

			for(int i=0; i<answer.length; i++) {
				answer[i] = list.get(i);
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {1,2,3,4,5};
		int[] ans = sol.solution(test);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<ans.length; i++) {
			list.add(ans[i]);
		}

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
