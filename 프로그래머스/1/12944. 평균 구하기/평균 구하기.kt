class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        var count = 0;
        for(grade in arr){
            answer += grade
            count++;
        }
        return answer / count
    }
}