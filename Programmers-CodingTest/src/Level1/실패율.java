package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util. Map.Entry;

public class 실패율 {
	static class Solution {
	    public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        
	        Map<Integer, Integer> stage = new HashMap<Integer, Integer>();
	        Map<Integer, Double> fail = new HashMap<Integer, Double>();
	        
	        for(int i : stages) {
	        	stage.put(i, stage.getOrDefault(i, 0) + 1);
	        }
	        
	        int user = stages.length;
	        int nowStage = 1;
	        
	        while(nowStage <= N+1) {
	        	for(Entry<Integer, Integer> e : stage.entrySet()) {
	        		if(e.getKey() == nowStage) {
	        			fail.put(nowStage, e.getValue() / Double.valueOf(user));
	        			user -= e.getValue();
	        			break;
	        		}
	        	}
	        	nowStage++;
	        }
	        
	        for(int i=1; i<=N+1; i++) {
	        	fail.put(i, fail.getOrDefault(i, 0.0)); // 실패율 none 처리
	        }
	        
	        fail.remove(N+1); //
	        
	        List<Integer> list = new ArrayList<Integer>(fail.keySet());
	        Collections.sort(list, (o1, o2) -> (fail.get(o2).compareTo(fail.get(o1))));
	        
	        answer = list.stream().mapToInt(i -> i).toArray();
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] ans = sol.solution(5, test);
		
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
