import java.util.Scanner;

public class Algo1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr =sc.nextLine().trim();
		int result = arr.split(" ").length;
		
		if(arr.isEmpty()) {
			System.out.print(0);
		}else
		System.out.print(result);
	}

}


// �� ���������� �ܾ�̶�� �����ϱ� �پ��� �ؼ� String�� Arr�� �Ѵ���
// Arr�� ũ�⸦ ����Ʈ�ϸ� �Ǵ� ���� �Ŷ�� �����ߴµ� �ڲ� �̻��� ���� ������? 
// ???? �� Ʋ�� �� �𸣰ڴ�. 

// ��� �� ! .trim(); �� �ڿ� ������ �߶��ش�. 
// Ʋ�� ���� : �ƹ��͵� ���� �� 0�� ����Ʈ �Ǿ���Ѵ�. 