package Level1;

public class 정수제곱근판별 {
	public long solution(long n) {
		long answer = 0;
		double sqrt = Math.sqrt(n);
		if(sqrt % 1 == 0){
			answer = (long)Math.pow(sqrt+1,2);
		}else{
			answer = -1;
		}
		return answer;
	}
}
