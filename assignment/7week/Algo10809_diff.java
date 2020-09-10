import java.util.Scanner;

public class Algo10809_diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		for (int i=97; i<123;i++) {
			int cnt = 0;
			char order = (char) i;
			//System.out.println(order);
			for(int j=0; j<word.length();j++) {
				if(word.charAt(j)==order) {
					cnt++;
				}
			}System.out.print(cnt);
		}

	}

}

//String a = sc.next();
//int asci = a.charAt(0);

// 전에 풀었던 문제랑 비슷하다. Algo2557
// 어떤 단어가 출제되면 A~Z까지 나열하여 몇번 사용되어있는 지 출력하는 문제이다. 
// A~Z까지는 26개가 존재한다. 

// 2557을 차용해서하면 for문 두개로 했었는데 
// 