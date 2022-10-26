package Level1;
import java.util.Scanner;

public class 직사각형별찍기 {

	class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			for(int j=0; j<b; j++) {
				for(int i=0; i<a; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			sc.close();
		}
	}
}
