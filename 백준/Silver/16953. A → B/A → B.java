import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        int count = 1;
        while (B >= A){
            if ( A == B){
                break;
            }
            if ( B % 2 == 0){
                B = B / 2;
            }else if( B % 10 != 1){
                count = -1;
                break;
            }else{
                B = B / 10;
            }
            count++;

        }
        if (A != B){
            count = -1;
        }
        System.out.println(count);
    }
}
