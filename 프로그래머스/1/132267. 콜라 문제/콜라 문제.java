class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; 
        int total = 0;
        while(n >= a){
            total = (n / a) * b;
            n = total + (n % a);
            answer += total;
        }
        return answer;
    }
}