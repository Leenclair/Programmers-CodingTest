package Level1;

public class 다트게임 {
	static class Solution {
		public int solution(String dartResult) {
			int answer = 0;
			
			int[] dart = new int[3];
			int num=0, idx = 0;
			String numStr = "";
			
			for(int i=0; i<dartResult.length(); i++) {
				char tmp = dartResult.charAt(i);
				
				//숫자
				if(tmp >='0' && tmp <='9') {
					numStr += String.valueOf(tmp);
				}
				
				//SDT
				else if(tmp=='S') {
					num = Integer.parseInt(numStr);
					dart[idx]=(int)Math.pow(num, 1);
					idx++;
					numStr ="";
				}else if(tmp=='D') {
					num = Integer.parseInt(numStr);
					dart[idx]=(int)Math.pow(num, 2);
					idx++;
					numStr ="";
				}else if(tmp=='T') {
					num = Integer.parseInt(numStr);
					dart[idx]=(int)Math.pow(num, 3);
					idx++;
					numStr ="";
				}
				
				// *#
				else if(tmp=='*') {
					dart[idx-1]*=2;
					if(idx>1) dart[idx-2]*=2;
				}else if(tmp=='#') {
					dart[idx-1]*=(-1);
				}
			}
			
			answer = dart[0]+dart[1]+dart[2];

			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String test = "1S*2T*3S";
		int ans = sol.solution(test);
		System.out.println(ans);
	}
}
