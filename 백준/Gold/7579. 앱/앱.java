import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;

        int[] memory = new int[n];
        int[] cost = new int[n];
        int[][] dp = new int[n][100001];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++){
            memory[i] = Integer.parseInt(st1.nextToken());
            cost[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0 ; i < n; i++){
            int memory1 = memory[i];
            int cost1 = cost[i];
            for(int j = 0 ; j <= 100000 ; j++){
                // i 는 데이터의 개수
                if (i == 0){
                    // j 는 memory와 cost
                    if (j >= cost1){
                        dp[i][j] = memory1;
                    }
                }else{
                    if(j >= cost1){
                        dp[i][j] = Math.max(dp[i-1][j-cost1] + memory1,dp[i-1][j]);
                    }else{
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                if(dp[i][j] >= m){
                    answer = Math.min(answer, j);
                }
            }
        }
        System.out.println(answer);
    }
}