import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[11];
        int answer = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            for(int j = 1; j <= N; j++){
                if(j >= 4){
                    dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
                }
            }
            sb.append(dp[N]).append("\n");
        }
        System.out.print(sb);
    }
}