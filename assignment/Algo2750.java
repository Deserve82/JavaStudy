import java.util.*;

public class Algo2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] line = new int[num];
		
		for (int i=0;i<line.length;i++) {
			line[i] = sc.nextInt();
		}
		Arrays.sort(line);
		for (int j=0;j<line.length;j++) {
		System.out.println(line[j]);
		}
	}
}
