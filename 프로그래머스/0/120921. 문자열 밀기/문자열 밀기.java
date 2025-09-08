class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int i;
        for(i = 0; i < B.length();i++){
            if(A.equals(B)){
                break;
            }else{
                String swap = A.substring(0,A.length()-1);
                String str = A.substring(A.length()-1,A.length());
                A = str+swap;
                answer++;
            }
        }
        if(i >= B.length()){
            answer = -1;
        }
        return answer;
    }
}