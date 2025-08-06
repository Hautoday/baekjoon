class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_length = p.length();
        long number_p = Long.parseLong(p);
        for(int i = 0; p_length <= t.length(); i++){
            long number = Long.parseLong(t.substring(i,p_length++));
            if(number_p >= number){answer++;}
        }
        return answer;
    }
}