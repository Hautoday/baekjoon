import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] health = new int[N+1];
        int[] smile  = new int[N+1];
        int answer = Integer.MIN_VALUE;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            health[i] = Integer.parseInt(st1.nextToken());
            smile[i] = Integer.parseInt(st2.nextToken());
        }
        int[][] dp = new int[N+1][101];
        for (int i = 1; i <= N; i++) {
            int health1 = health[i];
            int smile1 = smile[i];

            for (int j = 1; j <= 100; j++) {
                if(i == 1){
                    if(j >= health1){
                        dp[i][j] = smile1;
                    }else if (j == 100){
                        dp[i][j] = 0;
                    }
                }else{
                    if( j >= health1 ){
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-health1]+smile1);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
                answer = Math.max(answer, dp[i][j-1]);
            }
        }
        System.out.println(answer);
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j <= 100; j++) {
//                System.out.print(dp[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
}