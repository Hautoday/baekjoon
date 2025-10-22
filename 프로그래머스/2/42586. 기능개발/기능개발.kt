import java.util.LinkedList
import java.util.Queue
import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): List<Int> {
        val answer = mutableListOf<Int>()
        val queue: Queue<Int> = LinkedList()

        for (i in progresses.indices) {
            queue.add(ceil((100.0 - progresses[i]) / speeds[i]).toInt())
        }

        while (queue.isNotEmpty()) {
            val minDays = queue.poll()
            var count = 1
            while (queue.isNotEmpty() && queue.peek() <= minDays) {
                queue.poll()
                count++
            }
            answer.add(count)
        }
        return answer
    }
}