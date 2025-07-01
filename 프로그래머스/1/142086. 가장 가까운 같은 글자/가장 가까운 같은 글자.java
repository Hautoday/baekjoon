import java.util.*;
class Solution {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                answer[i] = -1;
                map.put(c,i);
            }else{
                answer[i] = i - map.get(c);
                map.put(c,i);
            }
        }
        return answer;
    }
}