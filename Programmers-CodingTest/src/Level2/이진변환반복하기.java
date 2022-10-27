package Level2;

import java.util.ArrayList;
import java.util.List;

public class ������ȯ�ݺ��ϱ� {
	static class Solution {
		public int[] solution(String s) {
			int[] answer = new int[2];
			int cnt = 0;
			int cnt2 = 0;
			
			while(!s.equals("1")) {
				answer[0]++;
				String tmp = s.replaceAll("0", "");
				answer[1] += s.length() - tmp.length();
				s = Integer.toBinaryString(tmp.length());
			}

			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = new int[2];
		answer = sol.solution("01110");
		System.out.println("answer[0]="+answer[0]+",answer[1]="+answer[1]);
	}
}
