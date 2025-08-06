import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int A = Math.min(sides[0],sides[1]);
        int B = Math.max(sides[0],sides[1]);
        for(int i = 0; i < B ; i++){
            if(A+i >= B){
                answer++;
            }
        }
        for(int i = B+1; i < A+B; i++){
            answer++;
        }
        return answer;
    }
} 