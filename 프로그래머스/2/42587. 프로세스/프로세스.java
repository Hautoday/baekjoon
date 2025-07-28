import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int length = priorities.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            for(int i = 0 ; i < length; i++){
                if(pq.peek() == priorities[i]){
                    answer++;
                    pq.poll();
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}