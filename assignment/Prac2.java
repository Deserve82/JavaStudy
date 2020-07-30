import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // n개의 배열을 만드는 것 
	        int[] x = new int[n]; 
	        int[] y = new int[n];
	        int[] ans = new int[n]; 
	        // 받은 값들을 int로 바꿔준다. 
	        for(int i = 0; i < n; i++) {
	            x[i] = sc.nextInt();
	            y[i] = sc.nextInt();
	        }
			// i[0]과 j를 돌리면서 비교하고, 큰 것이 있으면 ans[]++하고 아니면 넘어가고 
	        // 그러면서  모든 것에서 비교할 수 있다. 
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n; j++) {
	                if(i == j)
	                    continue; //continue를 하면 나가는 것이 아니라 위로 올라가서 j 다음 단계를 한다.
	                if(x[i] < x[j] && y[i] < y[j])
	                    ans[i]++;
	            }
	        }
			// ans[]가 0부터시작이니까 1을 더하는 것이다. 
	        for(int rank : ans) {
	            System.out.print((rank+1) + " ");
	        }
	    }
	}