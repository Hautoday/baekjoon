import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int length = dots.length;
        int x_max = dots[0][0];
        int y_max = dots[0][1];
        int x_min = dots[0][0];
        int y_min = dots[0][1];
        for(int i = 1; i < length; i++){
            x_max = Math.max(x_max,dots[i][0]);
            x_min = Math.min(x_min,dots[i][0]);
            y_max = Math.max(y_max,dots[i][1]);
            y_min = Math.min(y_min,dots[i][1]);
        }
        answer = (x_max - x_min) * (y_max - y_min);
        return answer;
    }
}