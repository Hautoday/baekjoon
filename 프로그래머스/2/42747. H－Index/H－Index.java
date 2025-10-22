import java.util.Arrays;
import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int count = 0;
        Arrays.sort(citations);
        for(int i = 1; i < citations.length ; i++){
            count = 0;
            for(int j = citations.length-1; j >= 0; j--){
                if(citations[j] > i){
                    count++;
                }
            }
            if(count == i){
                answer = count;
                break;
            }else{
                answer = count;
            }
        }
        return answer;
    }
}