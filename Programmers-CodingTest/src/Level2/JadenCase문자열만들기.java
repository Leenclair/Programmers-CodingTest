package Level2;

public class JadenCase���ڿ������ {
	class Solution {
	    public String solution(String s) {
	    	String answer = "";
	    	
	    	String[] arr = s.toLowerCase().split("");
	    	boolean isFirst = true;
	    	
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		answer += isFirst ? arr[i].toUpperCase() : arr[i];
	    		isFirst = arr[i].equals(" ") ? true : false;
	    	}
	    	
	    	
	        return answer;
	    }
	}
}
