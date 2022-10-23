package Level1;

public class 가운데글자가져오기 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        String[] arr= s.split("");
	        
	        if(arr.length%2 !=0) {
	        	int idx = arr.length/2;
	        	answer = arr[idx];
	        }else {
	        	int idx = arr.length/2 -1;
	        	answer = arr[idx]+arr[idx+1];
	        }
	        
	        return answer;
	    }
	}
}
