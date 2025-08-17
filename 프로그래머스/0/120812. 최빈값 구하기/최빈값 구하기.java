import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        int[] arr = new int[map.size()];
        int count = 1;
        for(int i = 0; i < map.size(); i++){
            arr[i] = map.get(count++);
        }
        Arrays.sort(arr);
        if(arr.length == 1){
            return arr[0];
        }else if(arr[0] == arr[arr.length - 1]){
            return -1;
        }else{
            answer = arr[arr.length - 1];
        }
        return answer;
    }
}