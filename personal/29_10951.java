import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
        int a = scan.nextInt();
        int b = scan.nextInt();
         System.out.println(a+b);
        }
    }
}

// Scanner Class
// 생성자 
// static Scanner create(File source) : 주어진 파일의 내용을 읽을 수 있는 Scanner 객체 리턴
// static Scanner create(InputStream source) : InputStream에서 데이터를 읽을 수 있는 Scanner 객체를 리턴

// 메소드
// boolean hasNext() 다음 토큰의 유무 리턴, 있다면 true
// boolean hasNext<type>() <type>에 해당하는 토큰 유무 리턴
// String next() 다음 토큰을 문자열 형태로 리턴
// <type> next<type>() - <type>에 해당되는 토큰의 데이터를 리턴한다



// Python Code

// while True:
// 	try:
// 		a, b = map(int, input().split())
//		print(a+b)
//	except:
//		break



// import sys
// for line in sys.stdin:
// 		a, b = map(int, line.split())
//		print(a + b)



// try:
//		while 1:
//			a,b = map(int, input().split())
//			print(a+b)
//		except:
//			exit()



// while True:
// 		try:
//			a, b = map(int, input().split())
//			print(a+b)
//		except:
//			break
		