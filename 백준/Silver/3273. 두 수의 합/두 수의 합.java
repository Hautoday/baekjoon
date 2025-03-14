import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N ; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        int count = 0;
        int L = 0;
        int sum = 0;
        int R = N-1;
        while(L < R){
            sum = arr[L] + arr[R];
            if (sum <= M){
                L++;
            }else if(sum > M){
                R--;
            }
            if(sum == M){
                count++;
            }
        }
        System.out.print(count);
    }
}