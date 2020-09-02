import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int arr[];
			int number = scanner.nextInt();
			int min = 0;
			int max = 0;
			
			max = -1000000;
			min = 1000000;
			
			arr = new int[number];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
				min = Math.min(min, arr[i]);
				max = Math.max(max, arr[i]);
			}
			
			
			System.out.print(min + " " + max);;
	}
}

// Math 클래스의 max(), min() 메소드
// 전달된 두 값을 비교하여 그 중 큰 값, 작은  반