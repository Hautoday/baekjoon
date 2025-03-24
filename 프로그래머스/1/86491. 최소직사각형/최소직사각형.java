import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        //모든 명함을 수용하기 위해서는 반을 나눠서 
        //가장 큰 수들의 최댓값과 가장 작은 수들의 최댓값을 곱하면 된다.
        int answer = 0;
        int L_max = 0;
        int R_min = 0;
        for(int i = 0; i < sizes.length; i++){
            int L = Math.max(sizes[i][0], sizes[i][1]);
            int R = Math.min(sizes[i][0], sizes[i][1]);
            L_max = Math.max(L_max,L);
            R_min = Math.max(R_min,R);
        }
        answer = L_max * R_min;
        return answer;
    }
}