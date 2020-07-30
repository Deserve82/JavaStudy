import java.util.Scanner;

//Factorial °ª 

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(Fact(a));
	}
	public static int Fact(int a) {
		if (a <= 1) {
			return a;
		} else {
			return a + Fact(a-1);
		}
	}
}