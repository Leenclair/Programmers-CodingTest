package Level2;

import java.util.Arrays;

public class 구명보트 {
	class Solution {
		public int solution(int[] people, int limit) {
			
			Arrays.sort(people);
			
			int answer = 0;
			int idx = 0;
			
			for(int i = people.length-1; i>=idx; i--) {
				if(people[idx]+people[i]<=limit) {
					idx++;
					answer++;
				}else {
					answer++;
				}
			}

			return answer;
		}
	}
}
