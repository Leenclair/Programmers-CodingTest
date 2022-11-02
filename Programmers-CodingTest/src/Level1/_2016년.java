package Level1;

public class _2016³â {
	static class Solution {
		public String solution(int a, int b) {
			String answer = "";

			String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
			int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int allDays = 0;
			
			for (int i = 0; i < a - 1; i++) {
				allDays += days[i];
			}

			allDays += (b - 1);
			answer = day[allDays % 7];

			return answer;
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String ans = sol.solution(5, 24);
		System.out.println(ans);
	}
}
