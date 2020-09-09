import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int time;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char [] dials = br.readLine().toCharArray();
	for(char c: dials) {
		time += (c-'A')/3+3;
		if(c=='S' || c == 'V' || c == 'Y' || c=='Z')
			time--;
	}
	System.out.print(time);
	}
}


//toCharArray()메소드 
// 문자열을 char배열로 바꾸고 새롭게 만들어진 문자 배열 리턴

// 0,1,2는 3초. 3,4,5는 4초
// 알파벳 3으로 나눈 값에 +3을 해준다
// SVYX는 예외처리
