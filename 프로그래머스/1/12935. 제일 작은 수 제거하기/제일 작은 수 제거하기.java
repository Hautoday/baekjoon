import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer1 = {-1};
            return answer1;
        }else{
            int[] arrCopy = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                arrCopy[i] = arr[i];
            }
            Arrays.sort(arrCopy);
            int[] answer = new int[arrCopy.length-1];
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arrCopy[0] == arr[i]){
                    continue;
                }else{
                    answer[count] = arr[i];
                    count++;
                }
            }
            return answer;
        }
    }
}