import java.util.Scanner;

public class  Algo2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int result = 0;
		
		while(sugar > 2 ) {
			if(sugar % 5 ==0) {
				result += sugar / 5;
				sugar = 0;
			} else {
				sugar -= 3;
				result ++;
			}
		}
		
		if (sugar >0) {
			System.out.println(-1);
		} else {
			System.out.print(result);
		}
		
		
		
	
	}
}