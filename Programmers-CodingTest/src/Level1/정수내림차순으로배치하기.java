package Level1;

public class ���������������ι�ġ�ϱ� {
	class Solution {
	    public long solution(long n) {
	        
	        char[] arr = String.valueOf(n).toCharArray();
	        int tmp = 0;
	        
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=i+1;j<arr.length;j++) {
	        		if(arr[i] < arr[j]) {
	        			tmp = arr[i];
	        			arr[i]=arr[j];
	        			arr[j]=(char)tmp;
	        		}
	        	}
	        }
	        
	        return Long.parseLong(String.valueOf(arr));
	    }
	}
}
