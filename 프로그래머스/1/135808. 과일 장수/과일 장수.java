import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length;
        Arrays.sort(score);
        int lowNum = score[length - 1];
        int count = 1;
        for(int i = length-2; i >= 0; i--){
            lowNum = Math.min(score[i],lowNum);
            count++;
            if(count >= m){
                answer += lowNum * m;
                count = 0;
            }
        }
        return answer;
    }
}