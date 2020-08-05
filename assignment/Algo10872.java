import java.util.*;

public class Algo10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(Fact(a));
	}
	public static int Fact(int a) {
		if (a <= 1 && a>=0) {
			return 1;
		} else {
			return a * Fact(a-1);
		}
	}
}