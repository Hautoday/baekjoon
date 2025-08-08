import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String number = "";
        String[] numbers = {
            "zero","one","two","three","four","five","six","seven","eight","nine"
        };
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], map.getOrDefault(0,i));
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 97 && c <= 122){
                number += c;
                if(map.containsKey(number)){
                    str += map.get(number);
                    number = "";
                }
            }else{
                str += c;
            }
        }
        answer = Integer.parseInt(str);
        return answer;
    }
}