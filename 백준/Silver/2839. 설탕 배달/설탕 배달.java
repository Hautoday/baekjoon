import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num % 5 == 0){
            System.out.println(num / 5);
        }else{
            int count = 0;
            while(num > 0){
                num -= 3;
                count++;
                if(num % 5 == 0){
                    count += num / 5;
                    System.out.println(count);;
                    break;
                }else if(num == 1 || num == 2){
                    System.out.println("-1");
                    break;
                }else if(num == 0){
                    System.out.println(count);
                    break;
                }
            }
        }

    }
}