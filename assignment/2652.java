import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int max_ind = 0;
		
		for(int i = 1; i <= 9; i++) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
				max_ind = i;
				}
			}
			
			System.out.println(max);
			System.out.println(max_ind);
	}
	
}