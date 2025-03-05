import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(answer(N,0));
    }
    public static int answer(int N, int count){
        if( N < 2 ){
            return count;
        }
        return Math.min(answer(N / 2, count + 1 + (N % 2)), answer(N / 3, count + 1 + (N % 3)));
    }
}