import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] item = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0] = Integer.parseInt(st.nextToken());
            item[i][1] = Integer.parseInt(st.nextToken());
        }

        // 내가 가질 수 있는 팩팩 1 - 7
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                // 0번이 무게
                // 1번이 가치
                if (item[i][0] > j ){
                    // 내 가방이 아이템을 수용 할 수 없을떄
                    // 이전 가방에 넣은 최대값을 다시 가져와야 함.
                    dp[i][j] = dp[i-1][j];
                }else{
                    // 선택을 안했을경우 이전 최대값
                    // 선택을 했을경우에는 이전값에 + 다음값
                    dp[i][j] = Math.max(dp[i-1][j],  dp[i-1][j - item[i][0]] + item[i][1]);
                }
            }
        }
        System.out.println(dp[N][M]);
    }
}
