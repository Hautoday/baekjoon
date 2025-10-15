class Solution {
    public int solution(int n) {
        final int maxnum = 1000000007;
        int[] dp = new int[5000];
        dp[1] = 2;
        dp[2] = 3;
        dp[4] = 11;
        for(int i = 3; i <= n; i++){
            if(i % 2 == 0){
                dp[i] = ((dp[i-1] % maxnum) + (dp[i-2] % maxnum)) % maxnum;
            }else{
                dp[i] = ((dp[i - 1] * 2) % maxnum) + ((dp[i - 2]) % maxnum) % maxnum;
            }
        }
        return dp[n];
    }
}

