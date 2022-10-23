package Level1;

public class 문자열다루기기본 {
	static class Solution {
		public boolean solution(String s) {
			boolean answer = true;

			char[] str = s.toCharArray();

			if(str.length!=4 && str.length!=6) {
				answer = false;
			}else {
				for(int i=0; i<str.length; i++) {
					if(!(str[i]>='0' && str[i]<='9')) {
						answer = false;
					}
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		boolean bool = s.solution("1234");
		System.out.println(bool);
	}
}
