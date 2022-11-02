package Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 {
	static class Solution {
		public String solution(String[] participant, String[] completion) {
			String answer = "";

			//			Arrays.sort(participant);
			//			Arrays.sort(completion);
			//
			//			for(int i=0; i<completion.length; i++) {
			//				if(!participant[i].equals(completion[i])) {
			//					System.out.println(participant[i]);
			//					answer = participant[i];
			//					break;
			//				}else if(!participant[i+1].isEmpty()) {
			//					answer = participant[i+1];
			//				}
			//			}

			HashMap<String, Integer> map = new HashMap<String, Integer>();

			for(String part : participant)
				map.put(part, map.getOrDefault(part, 0) + 1);

			for(String comp : completion)
				map.put(comp, map.get(comp) - 1);

			Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
			
			while(iter.hasNext()) {
				Map.Entry<String, Integer> entry = iter.next();
				if(entry.getValue() != 0) {
					answer = entry.getKey();
					break;
				}
			}
			

			return answer;
		}
	}

	public static void main(String[] args){
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Solution sol = new Solution();
		System.out.println(sol.solution(part, comp));
	}
}
