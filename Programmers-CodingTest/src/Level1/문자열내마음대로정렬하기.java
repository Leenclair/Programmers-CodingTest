package Level1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
	static class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        ArrayList<String> list = new ArrayList<String>();
	        
	        for(int i=0; i<strings.length; i++) {
	        	list.add(strings[i].charAt(n)+strings[i]);
	        }
	        
	        Collections.sort(list);

	        
	        for(int i=0; i<strings.length; i++) {
	        	answer[i] = list.get(i).substring(1, list.get(i).length());
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strings = {"sun", "bed", "car"};
		strings = sol.solution(strings, 1);
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
}
