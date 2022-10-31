package Level2;

import java.util.ArrayList;

public class 영어끝말잇기 {
	static class Solution {
	    public int[] solution(int n, String[] words) {
	        int[] answer = new int[2];
	        ArrayList<String> list = new ArrayList<String>();
	        
	        for(int i=0; i<words.length; i++) {
	        	
	        	//포함글자 행렬(?) check
	        	if(list.contains(words[i])){
	        		answer[0] = (i%n)+1;
	        		answer[1] = (i/n)+1;
	        		break;
	        	}
	        	
	        	list.add(words[i]);
	        	
	        	//끝말잇기 틀렸을 때
	        	if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
	        		answer[0] = (i%n)+1;
	        		answer[1] = (i/n)+1;
	        		break;
	        	}
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] str = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] ans = sol.solution(3, str);
		System.out.println("ans[0]="+ ans[0] +", ans[1]="+ans[1]);
	}
}
