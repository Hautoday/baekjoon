import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        for(int i = 0 ; i < n; i++){
            arr[i] = new int[i+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int len = arr.length;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            dp[len-1][i] = arr[len-1][i];
        }
        for(int i = len - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                dp[i][j] = arr[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
            }
        }
        System.out.println(dp[0][0]);
    }
}