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




// ���...? ��Ȳ������.. �ð��ʰ��� ����. ���� �����µ� ;; 
// ������ �̾߱��ߴ� BufferedReader�� �Ẹ�� 
// �׷��� �ð� �ʰ� ... ����� �ٲ���ϴ� �� ����. 
// �츮�� ���� �̿��ϴ� >,<,=�� 2�׿������̰�, 
// ?:�� ���� ���� 3�� �������̴�. 

// temp�� �� �� �ִ� ���� �ϴ� ���� �Ϳ� ���� ������ ���� ���̴�. 
// ù���� �� ���� - �ö󰡴� ���� ���� ���� �ؾ��Ѵ�. 
// �׷��� �� ���� �Ϸ翡 �ö� �� �ִ� ���� (�������� ���� - �ö󰡴� ����)�� ������
// �ٷ� ���� ���´�. 