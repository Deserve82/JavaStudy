import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int code = sc.next().charAt(0);
        
        System.out.println(code);
    }
}

// a = b.charAt(0);
// 문자를 char형 숫자로 변n
// b = Character.toString((char)a); 


// (InputStream) Stream
// 바이트 단위 데이터 구
// 파일 데이터, http 응답 데이터, 키보드 입력

// Scanner는 InputStream의 바이트단위로 읽어들이는 형식을 문자단위character데이터로 변환시키는 중개자 역할
// 문자열을 받고 싶다면 char배열로 받을 수 있음

// BufferedReader
// 기본 선언
//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 기본적으로 바이트 스트림통해 바이트단위로 데이터 입력받음
// char형태로 처리하기 위해 문자스트림으로 감싸줌
// 스트림에 버퍼를 두어 문자를 버퍼에 일정 정도 저장해둔 뒤 한번에 보내 속도면에서 효율

