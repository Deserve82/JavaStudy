import java.util.Scanner;

public class Algo1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year_fee = sc.nextInt();
		int one_fee = sc.nextInt();
		int one_sell = sc.nextInt();
		int num_sell =0; 
		
		while((year_fee+(one_fee*10))>(one_sell*num_sell)) {
			num_sell++;
			if (one_fee > one_sell) {
				num_sell = -2;
			}
		}
		
		System.out.print(num_sell+1);
		

	}

}
