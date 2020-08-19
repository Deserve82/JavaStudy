import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); // 입력받은 정수
        int firstNum, secondNum;
        int cycle = 0; // 사이클의 길이 
        
        firstNum  = n;
        
        if(n != 0) {
	        while (true) {
	        	secondNum = firstNum / 10 + firstNum % 10;
	        	firstNum = (firstNum % 10 * 10) + secondNum % 10;

	        	cycle ++;
	        	
	        	if (n == secondNum)
	        		break;
	        }
	        
	    }

        System.out.println(n == 0? 1 : cycle);

        scan.close();
        
    }
    
    // 다 시 풀 기 