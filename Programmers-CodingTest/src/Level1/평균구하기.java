package Level1;

public class Æò±Õ±¸ÇÏ±â {
	public double solution(int[] arr) {
		double answer = 0;
		for(int i=0;i<arr.length;i++){
			answer += arr[i];
		}
		answer = answer/arr.length;
		return answer;
	}
}
