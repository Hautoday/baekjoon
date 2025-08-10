import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        String[] answer = new String[length];
        char[] c_str = new char[length];
        for(int i = 0; i < length; i++){
            strings[i] = strings[i].substring(n,n+1) + strings[i];
        }
        Arrays.sort(strings);
        for(int i = 0; i < length; i++){
            answer[i] = strings[i].substring(1,strings[i].length());
        }
        return answer;
    }
}