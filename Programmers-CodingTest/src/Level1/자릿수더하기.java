package Level1;

public class �ڸ������ϱ� {
	public int solution(int n) {
		int answer = 0;
		while(n != 0){
			answer += n % 10;
			n /= 10;
		}

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("Hello Java");

		return answer;
	}
}
