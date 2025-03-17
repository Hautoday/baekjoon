class Solution {
    public String solution(String s) {
        String answer = "";
        boolean swap = true;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                answer += ' ';
                swap = true;
                continue;
            }
            if (!swap){
                answer += Character.toString(c).toLowerCase();
                continue;
            }else{
                swap = false;
                answer += Character.toString(c).toUpperCase();
            }
        }
        
        return answer;
    }
}