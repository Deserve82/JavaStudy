import java.util.*;

public class Algo2920 {

	public static void main(String[] args) {
		final int SIZE = 8;
		int [] music = new int[SIZE];
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		for (int i =0; i<SIZE; i++) {
			music[i] = sc.nextInt();
		}
		
		for (int i=0; i<music.length-1 ; i++) {
			if(music[i]<music[i+1]) {
				result = "ascending";
			}else if(music[i]>music[i+1]) {
				result = "descending";
			}else {
				result = "mixed";
				break;
			} 
		}
		System.out.print(result);
	}

}

// 내가 생각한 방법
// 1. 크기가 8인 배열을 먼저 만든다. 
// 2. for문으로 인해 받은 값들을 크기가 8인 배열에 넣는다. 
// 3. i칸의 값이 i+1칸보다 작으면 상승, i칸의 값이 i+1칸보다 크면 하강, 그렇지 않으면  mixed


// 의문 ?
// 왜 for문 안에 System.out.print(music); 하면 쓰레기 값이 나오는 거지 ?
// 왜 music[i]<music[i+1]는 안되고, music[i]+1==music[i+1]만 되는거지? 



// break는 생명 (계속 돌리면 result 값이 계속 바뀌어서 mixed여도 다른 값이 나올 수 있다.)