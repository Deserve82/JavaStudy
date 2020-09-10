import java.util.Scanner;

public class Algo2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=0; i<input;i++) {
			int number =sc.nextInt();
			String word = sc.next();
			String result ="";
			
			for(int j=0;j<word.length();j++) {
				for(int k=0; k<number;k++) {
					result = result + word.charAt(j);
				}
			}
			System.out.println(result);
		}
	}

}

// 일단 처음에는 input으로 몇번을 받을 지를 정한다. 
// 그 후에 순서쌍으로 1. 몇번반복할건지 2. 어떤 단어를 반복할건지 이다. 