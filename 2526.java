import java.util.*;
import java.io.*;


class Main {
    public static void main(String[ ] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] rest = new int[100];
        int N = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);
        int r = (N*N) % P;
        int count = 0;
        while (rest[r] < 2){
            rest[r] += 1;
            r = (r*N) % P;
        }
        for (int i=0; i<100; i++){
            if (rest[i]>1){
                count += 1;
            }
        }
        System.out.println(count);
    }
}