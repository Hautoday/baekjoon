class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        var count = 0
        citations.sort()
        for (i in 1 until citations.size) {
            count = 0
            for (j in citations.indices.reversed()) {
                if (citations[j] > i) {
                    count++
                }
            }
            if (count == i) {
                answer = count
                break
            } else {
                answer = count
            }
        }
        return answer
    }
}