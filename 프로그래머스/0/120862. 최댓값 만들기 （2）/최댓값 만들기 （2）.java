import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                num.add(numbers[i] * numbers[j]);
            }
        }
        num.sort(Comparator.reverseOrder());
        return num.get(0);
    }
}