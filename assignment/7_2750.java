import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int temp;

        for (int a = 0; a < data.length; a++) {
            data[a] = sc.nextInt();
        }
        for (int i = data.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < data.length; k++) {
            System.out.println(data[k]);
        }
        sc.close();
    }
}

// Python Code
// N = int(input())

// numbers = []

// for _ in range(N):
// numbers.append(int(input()))

// # Bubble Sort
// for i in range(len(numbers)) :
// for j in range(len(numbers)) :
// if numbers[i] < numbers[j] :
// numbers[i], numbers[j] = numbers[j], numbers[i]
// for n in numbers :
// print(n)

// 1. 버블 정렬
// 차례로 인접한 두 개의 원소를 비교하여 자리를 교환하는 방식의 정렬 알고리즘
// 1-1. 동작 방식
// 배열(혹은 리스트)의 첫 번째 원소부터 마지막 원소까지 인접 원소 간 대소 비교 반복, 더 큰 값을 가지 ㄴ원소가 왼쪽에 있다면 서로
// 자리를 바꿈 swap
// 위 과정을 반복하여 한 단계가 끝나면 가장 큰 값을 가진 원소가 배열(혹은 리스트)의 마지막 자리로 정렬
// 한 단계가 끝날 때마다 맨 끝에 위치한 원소는 정렬된 상태이므로 다음 단계에서는 정렬된 원소를 제외하고 대소 비교 진행
// 1-2. 메모리 사용 공간
// n개의 원소에 대해 n개의 메모리 사용
// 1-3. 연산 시간
// 최선의 경우 : 자료가 이미 정렬되어 있는 경우
// - 비교횟수 : i번째 실행 시 (n-i)번 비교하므로, n(n-1)/2번
// - 자리교환횟수 : 자리교환이 발생하지 않는다
// - 총 소요시간 : n(n-1)/2
// 최악의 경우 : 자료가 역순으로 정렬되어 있는 경우
// - 비교횟수 : i번째 실행 시 (n-i)번 비교하므로 n(n-1)/2번
// * 시간 복잡도 T(n) = O(N^2)

// N = int(input())
// nums = []

// for _ in range(N):
// nums.append(int(input()))
// # Insert Sort
// for i in range(1, len(nums)):
// while(i > 0) & (nums[i] < nums[i-1]) :
// nums[i], nums[i-1] = nums[i-1], nums[i]

// i -= 1
// for n in nums:
// print(n)

// 2. 삽입 정렬
// https://mong9data.tistory.com/44?category=885884
