package Level1;

public class �ڿ���������迭�θ���� {
	class Solution {
		public int[] solution(long n) {
			int[] answer = {};
			int i = 0;
			
			while(n != 0) {
				int a = (int)(n % 10);
				n /= 10;
				
				answer[i] = a;
				i++;
			}

			return answer;
		}
	}
}
