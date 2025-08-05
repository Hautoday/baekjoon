import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;
        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int truck : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.add(truck);
                    total += truck;
                    answer++;
                    break;
                }else if(queue.size() == bridge_length){
                     total -= queue.poll();
                }else{
                    if(total+truck <= weight){
                        queue.add(truck);
                        total += truck;
                        answer++;
                        break;
                    }else{
                        queue.add(0);
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}