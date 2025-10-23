class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = IntArray((right-left).toInt()+1)
        var index = 0;
        for(i in left..right){
            var row = i / n + 1
            var col = i % n + 1
            answer[index++] = Math.max(row,col).toInt()
        }
        return answer
    }
}