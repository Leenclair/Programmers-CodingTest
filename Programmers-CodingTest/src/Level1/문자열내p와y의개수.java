package Level1;

public class ���ڿ���p��y�ǰ��� {

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
	        
	        
	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("Hello Java");

	        return answer;
	    }
	}
	
}
