import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}
}


// HashSet
// 중복되는 원소 하나만 저장, 중복원소 허용하지 않음
// 순서 개념 없음, Collections.sort() 메소드 사용 불가
// 정렬하고 싶다면 리스트로 변환 후 정렬
// 서로 다른 개수를 세면 되는 문제로 중복일 경우 저장되지 않고 HashSet에 없으면 저장

