class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var count = 0;
        for(number in arr){
            if(number % divisor == 0){
                count++;
            }
        }
        var answer = IntArray(count)
        if(count == 0){
            return intArrayOf(-1)
        }else{
            count = 0;
            for(number in arr){
                if(number % divisor == 0){
                    answer[count++] = number
                }
            }
        }
        answer.sort()
        return answer
    }
}