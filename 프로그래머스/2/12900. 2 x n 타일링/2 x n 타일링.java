class Solution {
    public int solution(int n) {
        final int max = 1000000007;
        int[] dp = new int[60001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = ((dp[i-1] % max) + (dp[i-2] % max)) % max;
        }
        return dp[n];
    }
}