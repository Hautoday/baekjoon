import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        int Del = 0;
        int length = operations.length;
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < length; i++){
            String str1 = operations[i].substring(0, 1);
            int number = Integer.parseInt(operations[i].substring(2));
            if(str1.equals("I")){
                max.add(number);
                min.add(number);
            }
            if(!max.isEmpty() && !min.isEmpty()){
                if(str1.equals("D") && number == -1){
                    Del = min.poll();
                    max.remove(Del);
                }else if(str1.equals("D") && number == 1){
                    Del = max.poll();
                    min.remove(Del);
                }
            }
        }
        if(max.isEmpty() && min.isEmpty()){
            return answer;
        }else{
            answer[0] = max.peek();
            answer[1] = min.peek();
        }
        return answer;
    }
}