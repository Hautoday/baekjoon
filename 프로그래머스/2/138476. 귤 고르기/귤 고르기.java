import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int count = 0;
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr, Collections.reverseOrder());
        for(int value : arr){
            if(answer + value >= k){
                count++;
                break;
            }else{
                answer = answer + value;
                count++;
            }
        }
        return count;
    }
}
    