class Solution {
    boolean solution(String s) {
        int count = 0;
        boolean answer = false;
        if(s.charAt(0) == '(' && s.charAt(s.length()-1) == ')'){
            for (int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    count++;
                }else if (s.charAt(i) == ')'){
                    count--;
                }if(count < 0){
                    return false;
                }
            }
            if(count == 0){
                return true;
            }
        }
        return answer;
    }
}
