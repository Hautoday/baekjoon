class Solution {
    public int solution(int n) {
        final int max = 1000000007;
        int[] dp = new int[5001];
        dp[1] = 2;
        dp[2] = 3;
        dp[3] = 8;
        for(int i = 4; i <= n; i++){
            if( i % 2 == 0){
                dp[i] = ((dp[i-1] % max) + (dp[i-2] % max)) % max;
            }else{
                dp[i] = (((dp[i-1] * 2) % max) + (dp[i-2] % max)) % max;
            }
        }
        return dp[n];
    }
}