import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); // 첫줄 입력되는 자릿수 
		String input = sc.next(); // 두번째 줄 숫자 개
		sc.close();
		
		int result = 0; // 결과 
		for (int i = 0; i < count; ++ i) {
			result += input.charAt(i) - '0';
			
		}
		
		System.out.println(result);
	
	}
}