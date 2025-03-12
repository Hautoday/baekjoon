import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int L = 0;
        int R = 0;
        int sum = 0;

        while(true){
            if (sum >= M){
                sum -= arr[L++];
            }else if(R == N){
                break;
            }
            else {
                sum += arr[R++];
            }
            if (sum == M){
                count++;
            }
        }
        System.out.print(count);
    }
}