package Level1;

public class 진법뒤집기 {
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			String str = "";
			
			while(n!=0) {
				str += n%3;
				n = n/3;
			}
			
			answer = Integer.parseInt(str, 3);

			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int ans = sol.solution(45);
		System.out.println(ans);
	}
}
