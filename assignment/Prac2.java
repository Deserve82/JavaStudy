import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // n���� �迭�� ����� �� 
	        int[] x = new int[n]; 
	        int[] y = new int[n];
	        int[] ans = new int[n]; 
	        // ���� ������ int�� �ٲ��ش�. 
	        for(int i = 0; i < n; i++) {
	            x[i] = sc.nextInt();
	            y[i] = sc.nextInt();
	        }
			// i[0]�� j�� �����鼭 ���ϰ�, ū ���� ������ ans[]++�ϰ� �ƴϸ� �Ѿ�� 
	        // �׷��鼭  ��� �Ϳ��� ���� �� �ִ�. 
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n; j++) {
	                if(i == j)
	                    continue; //continue�� �ϸ� ������ ���� �ƴ϶� ���� �ö󰡼� j ���� �ܰ踦 �Ѵ�.
	                if(x[i] < x[j] && y[i] < y[j])
	                    ans[i]++;
	            }
	        }
			// ans[]�� 0���ͽ����̴ϱ� 1�� ���ϴ� ���̴�. 
	        for(int rank : ans) {
	            System.out.print((rank+1) + " ");
	        }
	    }
	}