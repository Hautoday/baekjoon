class Solution {
    public long solution(int n) {
        // DP 문제 인것으로 보임.
        // 1칸 혹은 2칸 이동가능 
        // 해당 문제는 규칙성이 있음.
        long answer = 0;
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        answer = dp[n-1];
        return answer;
    }
}