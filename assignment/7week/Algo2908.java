import java.util.Scanner;

public class Algo2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr1 = sc.next().split("");
		String[] arr2 = sc.next().split("");
		
		// 순서를 바꾸기 위한 임시
		String [] temp = new String[arr1.length];
		// reverse해버리기
		// 아래꺼 완전 틀림 
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
		// 첫번째꺼
		temp[0]=arr1[0];
		arr1[0]=arr1[2];
		arr1[2]=temp[0];
		// 두번째꺼
		temp[1]=arr2[0];
		arr2[0]=arr2[2];
		arr2[2]=temp[1];
	
		
		// 배열을 int로 만들기
	
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


// ? 은근히 어려운 문제 
// 지금 내가 해결하려는 방식은 
// String[]으로 숫자를 받는다. 받을 때, 한 글자씩 배열 한 칸에 넣어야하니까 split("")으로 자른다. 
// 이 배열을 뒤집는다. 옹옹
// 뒤집은 배열을 int로 만들어야하는데, 배열 -> int가 배열 한 칸을 int로 바꾸는건 가능한데, 
// 배열을 다 짤라서 int로 하는것을 어떻게 해야할 지 모르겠다. {'1','2','3'}에서 '1'하나를 int로 바꾸는 건 가능한데
// '1', '2', '3'을 int 123으로 한꺼번에 바꾸는 건 없는 듯 하다. 


//