import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] charArr = str.toCharArray(); 
        Arrays.sort(charArr);
        String reverse ="";
        for (int i = charArr.length - 1; i >= 0; i--) {
            reverse = reverse + charArr[i];
        }
        long answer = Long.parseLong(reverse);
        return answer;
    }
}