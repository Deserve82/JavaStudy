import java.io.BufferedReader;
import java.io.InputStreamReader;


class BOJ5585 {
    public static void main(String[ ] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        amount = 1000 - amount;
        int count = 0;
        while (amount != 0){
            if (amount >= 500) {
                amount -= 500;
                count += 1;
            }
            else if (amount >= 100) {
                amount -= 100;
                count += 1;
            }
            else if (amount >= 50){
                amount -= 50;
                count += 1;
            }
            else if (amount >= 10){
                amount -= 10;
                count += 1;
            }
            else if (amount >= 5){
                amount -= 5;
                count += 1;
            }
            else {
                amount -= 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}