import java.util.Arrays;
import java.util.Scanner;

public class Algo2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long [] line = new long[num];
		
		for (int i=0;i<line.length;i++) {
			line[i] = sc.nextLong();
		}
		Arrays.sort(line);
		for (int j=0;j<line.length;j++) {
		System.out.println(line[j]);
		}
	}
}

// 시간초과? 
// 버퍼를 이욯하라고 함 