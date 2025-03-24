class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int one_count = countChar(str, '1');
        // 기존 1의 개수와 
        // N+1한 1의 개수가 같으면 return 
        for(int i = n+1; i < 1000000; i++){
            String temp = Integer.toBinaryString(i);
            if(countChar(temp,'1') == one_count){
                return i;
            }
        }
        return answer;
    }
    // 1의 개수 세기
    public static int countChar(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    
}