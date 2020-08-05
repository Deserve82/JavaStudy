import java.util.*;

public class Algo10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
			for(int j=1;j<num;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		
		for(int x=1;x<num-1;x++) {
			for(int y=num-x; y>1 ;y--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int z=1 ; z<=(2*x)-1  ; z++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
			
		for (int a=0; a<(num*2)-1;a++) {
			System.out.print("*");
		}
	}
}


// 나의 생각
// 1. 먼저 트리를 만든다. 
// 2. 트리 안에 " "가 올 수 있게 한다. 

// 위에 생각이 틀리고 일단 분해하자. 분해를 하면 
// 가장 첫부분과 마지막부분은 따로 만들어야한다. 
// 이제 그 두 부분을 없앤 곳을 반복해야한다. num은 늘어나야하고, " "은 num-2에서 줄어들어야하고, 가운데 " "은 1,3,5 홀수로 늘어나야한다.  