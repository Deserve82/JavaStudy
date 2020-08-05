import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputcount = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < inputcount; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

// Python Code
// Merge sort, Heap sort로 풀어야 함
// http://ejklike.github.io/2017/03/04/sorting-algorithms-with-python.html
// https://assaeunji.github.io/python/2020-05-06-bj2751/
