import java.util.*;
public class Solution {
    public int solution(int n) {
        int battery = 0;
        // 한칸 점프를 하면 건전지 +1
        // 순간이동을 하면 이동거리 X2 
        // 순간이동은 짝수처리
        // 한칸점프는 홀수처리
        // N이 0이 될때까지
        for ( int i = n; i > 0; ){
            if(i % 2 != 0){
                i = i - 1;
                battery++;
                continue;
            }
            i = i / 2;
        }
        return battery;
    }
}