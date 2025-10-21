class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size,{0})
        for(i in 0..commands.size-1){
            answer[i] = array_select(array, commands[i][0],commands[i][1],commands[i][2])
        }
        return answer
    }
    fun array_select(arr:IntArray, first:Int, mid:Int, end:Int):Int{
        var number = 0
        var count = 0
        var numbersort = IntArray((mid-first)+1, {0})
        for(i in first..mid){
            numbersort[count++] = arr[i-1]            
        }
        numbersort.sort()
        number = numbersort[end-1]
        return number
    }
}