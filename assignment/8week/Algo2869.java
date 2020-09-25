import java.util.Scanner;

public class Algo2869 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        
        int temp = (c-b)/(a-b); 
        if((c-b)%(a-b)!=0){
            temp++;
        }
        System.out.println(temp); 
    } 
}




// 어ㅓ...? 당황스럽네.. 시간초과가 떴다. 답은 나오는데 ;; 
// 우현씩 이야기했던 BufferedReader를 써보자 
// 그래도 시간 초과 ... 방식을 바꿔야하는 것 같다. 
// 우리가 흔히 이용하는 >,<,=는 2항연산자이고, 
// ?:을 쓰는 것은 3항 연산자이다. 

// temp을 쓸 수 있는 것은 일단 빼는 것에 대한 생각을 없앤 것이다. 
// 첫날은 총 길이 - 올라가는 높이 부터 시작 해야한다. 
// 그래서 이 것은 하루에 올라갈 수 있는 길이 (내려가는 높이 - 올라가는 높이)를 나누면
// 바로 값이 나온다. 