class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf(0, 0)
        var str = s
        var number = 0
        var count = 0
        var deleteCount = 0

        while (true) {
            for (ch in str) {
                if (ch == '1') {
                    number += 1
                } else {
                    deleteCount++
                }
            }
            count++
            if (number == 1) {
                break
            }
            str = number.toString(2)
            number = 0
        }
        answer[0] = count
        answer[1] = deleteCount
        return answer
    }
}