import java.util.Scanner;

public class Algo2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr1 = sc.next().split("");
		String[] arr2 = sc.next().split("");
		
		// ������ �ٲٱ� ���� �ӽ�
		String [] temp = new String[arr1.length];
		// reverse�ع�����
		// �Ʒ��� ���� Ʋ�� 
		/*for (int i=0;i<=1;i++) {
			temp[i]=arr1[i];
			arr1[i]=arr1[i+1];
			arr1[i+1]=temp[i];	
		}
		for (int i=0;i<=1;i++) {
		temp[i]=arr2[i];
		arr2[i]=arr2[i+1];
		arr2[i+1]=temp[i];
		}*/ 
		// ù��°��
		temp[0]=arr1[0];
		arr1[0]=arr1[2];
		arr1[2]=temp[0];
		// �ι�°��
		temp[1]=arr2[0];
		arr2[0]=arr2[2];
		arr2[2]=temp[1];
	
		
		// �迭�� int�� �����
	
		int num1 = 0;
		int num2 = 0;
		int [] ten = {100,10,1};
		for(int j=arr1.length;j>0;j--) {
			num1 = num1 + (Integer.parseInt(arr1[j-1]) * ten[j-1]);
			num2 = num2 + (Integer.parseInt(arr2[j-1]) * ten[j-1]);
		}
		
		if(num1>num2) {
			System.out.print(num1);
		}else {
			System.out.print(num2);
		}
		
	
	}

}


// ? ������ ����� ���� 
// ���� ���� �ذ��Ϸ��� ����� 
// String[]���� ���ڸ� �޴´�. ���� ��, �� ���ھ� �迭 �� ĭ�� �־���ϴϱ� split("")���� �ڸ���. 
// �� �迭�� �����´�. �˿�
// ������ �迭�� int�� �������ϴµ�, �迭 -> int�� �迭 �� ĭ�� int�� �ٲٴ°� �����ѵ�, 
// �迭�� �� ©�� int�� �ϴ°��� ��� �ؾ��� �� �𸣰ڴ�. {'1','2','3'}���� '1'�ϳ��� int�� �ٲٴ� �� �����ѵ�
// '1', '2', '3'�� int 123���� �Ѳ����� �ٲٴ� �� ���� �� �ϴ�. 


//