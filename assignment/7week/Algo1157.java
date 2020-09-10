import java.util.Scanner;

public class Algo1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		int [] alba = new int[26];
		int max = 0;
		char result = ' ';
		
		for(int i=0;i<word.length();i++) {
			alba[word.charAt(i)-65]++;
			if(alba[word.charAt(i)-65] > max) {
				result = word.charAt(i);
				max = alba[word.charAt(i)-65];
			}else if (alba[word.charAt(i)-65] == max) {
				result = '?';
			}
		}
		System.out.print(result);
		
	}

}


// 문자열을 이리저리 사용해야한다. 
// 일단 문제는 쉽다. 단어를 적어주면 가장 많이 쓰인 단어를 출력하면 되는 것이다. (구현하는 것이 어렵다.)
// 일단 답을 본 것인데, 답 보고 방법을 알고 다시 구현하는 것임. 

/* 
 1. 일단 단어를 받아야한다. 
 2. 알파벳 크기만큼의 배열을 만들고, 일단 받은 단어.length()만큼 for문을 돌린다. 
 3. 단어의 글자 순서(예를 들어 A는 첫번쨰 이런식으로)를 더한다. 
  
  
  ! 배운 것 .toUpperCase() 모든 알파벳을 대문자로 바꿔준다. 
  */
