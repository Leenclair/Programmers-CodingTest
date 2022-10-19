package Level1;

public class 문자열내p와y의개수 {

	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        int pNum = 0;
	        int yNum = 0;
	        
	        String[] st = s.split("");
	        
	        for(int i=0;i<st.length;i++) {
	        	if(st[i].equals("p") || st[i].equals("P")) {
	        		pNum++;
	        	}else if(st[i].equals("y") || st[i].equals("Y")) {
	        		yNum++;
	        	}
	        }
	        
	        if(pNum != yNum) {
	        	return answer = false;
	        }
	        
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");

	        return answer;
	    }
	}
	
}
