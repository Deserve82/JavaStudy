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

// ���� ������ ���
// 1. ũ�Ⱑ 8�� �迭�� ���� �����. 
// 2. for������ ���� ���� ������ ũ�Ⱑ 8�� �迭�� �ִ´�. 
// 3. iĭ�� ���� i+1ĭ���� ������ ���, iĭ�� ���� i+1ĭ���� ũ�� �ϰ�, �׷��� ������  mixed


// �ǹ� ?
// �� for�� �ȿ� System.out.print(music); �ϸ� ������ ���� ������ ���� ?
// �� music[i]<music[i+1]�� �ȵǰ�, music[i]+1==music[i+1]�� �Ǵ°���? 



// break�� ���� (��� ������ result ���� ��� �ٲ� mixed���� �ٸ� ���� ���� �� �ִ�.)