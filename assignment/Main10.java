import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0 ;i<a ;i++) {
			for(int j=0; j<i;j++ ) {
				System.out.print(" ");	
			}
			for (int j=0;j<2*(a-i)-1;j++) {
				System.out.print("*");
			}
				System.out.print("\n");
		}
		
		for(int i=1;i<a;i++) {
			for (int j=0;j<a-i-1 ;j++) {
				System.out.print(" ");
			}
			for (int j=0 ;j<(2*i)+1 ;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
