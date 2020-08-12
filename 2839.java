import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main1 {
    public static void main(String[ ] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int five;
        int three = 0;


        while(sugar%5!=0&&sugar>=0){
            sugar-=3;
            three++;
        }
        if(sugar<0){
            System.out.println(-1);
        }
        else{
            five = sugar/5;
            System.out.println(five+three);
        }

    }
}