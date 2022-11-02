package Level1;

public class 소수찾기 {
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			
			for(int i=2; i<=n; i++) {
				boolean flag = true;
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {
						flag = false;
						break;
					}
				}
				if(flag == true) answer++;
			}
			
			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int ans = sol.solution(5);
		System.out.println(ans);
	}
}