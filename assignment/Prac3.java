import java.util.*;



public class Prac3 {
	static int avg(int[] arr) { //������ �޼ҵ�
		double result =0; // ��� �� �ݿø��� ���� double��
		double sum=0;
		for(int x : arr) { // ��� ���Ѵ�.
			sum+=x;
		}
		result = Math.round(sum / arr.length); // �ݿø� �� ����
		
		return (int) result; // int������ Ÿ�� ĳ��Ʈ
	}
	
	// ? Math.round�� �ϰ� �� Math.ceil�� �ϴ���? 
	// ? result�� �� double�� �ϰ�, ������ return������ int�� �ϴ� ��? 
	
	static int middle(int[] arr) { // �߾Ӱ��� ���ϴ� �޼ҵ�
		
		//arr�� ������������ ������ �� �̴�. ��, arr.length�� �� ���̰� �����ϱ� 
		//�ű⿡�� 2�� ���� '��'�� ���� �߾Ӱ��̴�. 
		return arr[(arr.length/2)]; 
	}
	
	static int manny(int[] arr) { // �ֺ��� ���ϴ� �޼ҵ�
		int cnt[] = new int [8001]; // ���밪 4000������ ������ �����ؾ��ϹǷ� �� 8000���� ������µ�, ��Ÿ�� ������ ���� +1 �����.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE; // �ֺ��� ã������ �񱳺���
		for(int x:arr) {
		//�迭�� ���̳ʽ��� �����ϱ� +4000
			if(x<0) { // ������ ��� 4000�� ���ؼ� �ش� �ε����� ����
				cnt[Math.abs(x)+4000]++;
			}else cnt[x]++; // �������� �ε����� ����
		}
		int idx =0;
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]!=0 && cnt[i]>max) {	//ī��Ʈ �迭���� �ֺ��� ã�´�.			
				max = cnt[i];
				idx = i;				
			}
		}
		for(int i=0;i<cnt.length;i++) {
			int x=i;
			if(cnt[i]==max) { // ī��Ʈ �迭�� ����� �ֺ󰪰� ��ġ�ϸ�,
				if(i>4000) { // 4000�̻��� ������ �ٲ��ذ��̹Ƿ� �ٽ� ������ ���ڷ� �ٲ��ش�
					x-=4000;
					x*=-1;
					arrayList.add(x); // ��� ����Ʈ�� �߰�
				}else
					arrayList.add(i); // �������� �׳� i���� �߰�
			}
		}
		Collections.sort(arrayList); // �߰� �� �ֺ󰪵��� �ټ� �����ϸ� �������� ����
		
		if(arrayList.size()>1) return arrayList.get(1); // �ֺ��� ������ �����Ѵٸ�, ���� ���� ���ڿ��� �� ��° ���ڸ� ��ȯ
		else return arrayList.get(0); // �׿ܿ��� �׳� �ֺ��� ��ȯ
	}
	
	static int range(int[] arr) { // ���� �޼ҵ�
		return arr[arr.length-1] - arr[0]; // ���� �� ������ ���ڿ� ù ��° ���ڸ� ���ش�.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // �Է¹��� ������ �������� ����
		
		//�� �޼ҵ� ȣ�� ��
		System.out.println(avg(arr));
		System.out.println(middle(arr));
		System.out.println(manny(arr));
		System.out.println(range(arr));
//		
		
	}
	
}