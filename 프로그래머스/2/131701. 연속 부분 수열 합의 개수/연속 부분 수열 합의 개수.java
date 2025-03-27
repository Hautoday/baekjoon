import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        // 한번씩 돌아가며 체크하면 될 거 같음.
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < elements.length; i++){
            int sum = 0;
            for(int j = 0; j < elements.length; j++){
                sum += elements[(i+j) % elements.length];
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}