import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 테스트 케이스의 갯수 
		
		for (int i = 0; i < num; i++) {
			int cnt = sc.nextInt(); // 반복횟수 
			String str = sc.next(); // 문자열 
			
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < cnt; k++) {
					System.out.print(str.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
}