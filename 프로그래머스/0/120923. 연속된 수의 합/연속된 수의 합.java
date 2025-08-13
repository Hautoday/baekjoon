class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num % 2 == 1){
            int number = total / num - num / 2;
            for(int i = 0; i < num; i++){
                answer[i] = number++;
            }
        }else{
            int number = total / num - num / 2 + 1;
            for(int i = 0; i < num; i++){
                answer[i] = number++;
            }
        }
        return answer;
    }
}