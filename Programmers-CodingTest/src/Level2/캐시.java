package Level2;

class Solution {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		int hit = 0;
		int miss = 0;

		String[] tmp = new String[cacheSize];

		for(int i=0; i<tmp.length; i++) {
			tmp[i] = "";
		}
		
		for(int j=0; j<cities.length; j++) {
			boolean isMiss = true;
			for(int i=0; i<tmp.length; i++) {
				if(tmp[i].toLowerCase().equals(cities[j].toLowerCase())) {
					isMiss = false;
					String value = tmp[i];
					for(int k = tmp.length -1; k > 0; k--) {
						tmp[k]= tmp[k-1];
					}
					if(tmp.length > 0)
					tmp[0] = value;
					break;
				}
			}
			if(isMiss) {
				for(int k = tmp.length - 1; k > 0; k--) {
					tmp[k]= tmp[k-1];
				}
				if(tmp.length > 0)
				tmp[0] = cities[j];
				for(int i=0; i<tmp.length; i++) {
//				 System.out.print(tmp[i]+", ");
				}
//				System.out.println();
				miss += 5;
			}
			else hit += 1;
		}

		answer = hit + miss;
//		System.out.println(answer);
		return answer;
	}
}
public class Ä³½Ã {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] cities= {"Jeju", "Pangyo", "NewYork", "newyork"};
		sol.solution(2, cities);
		String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo","Seoul"};
		sol.solution(3, cities2);

	}
}
