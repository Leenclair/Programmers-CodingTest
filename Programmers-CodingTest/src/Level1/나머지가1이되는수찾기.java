package Level1;

public class ��������1�̵Ǵ¼�ã�� {
	class Solution {
		public int solution(int n) {
			for(int i=2; i<n; i++) {
				if(n%i==1) {
					return i;
				}
			}
			return -1;
		}
	}
}