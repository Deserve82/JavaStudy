import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int line = scan.nextInt();
        
       for(int i=0; i < line; i++) {
        	String input = scan.next(); 
        	if(input.contains("push")) {
        		int num = scan.nextInt();
        		stack.push(num);
        	}else if(input.equals("pop")) {
        		System.out.println(stack.isEmpty()?-1:stack.pop()); // 삼항연산자. stack에 정수가 없는 경우 -1, 스택이 비어있지 않으면 가장 위의 정수를 stack.pop()으로 제거 First in Last out
        	}else if(input.equals("size")) {
        		System.out.println(stack.size());
        	}else if(input.equals("empty")) {
        		System.out.println(stack.isEmpty()?1:0);
        	}else if(input.equals("top")) {
        		System.out.println(stack.isEmpty()?-1:stack.peek());
        	}
        }
    }
}
