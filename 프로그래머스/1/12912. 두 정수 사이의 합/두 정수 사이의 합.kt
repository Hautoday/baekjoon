class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(a > b){
            answer = sum(b,a)
        }else{
            answer = sum(a,b)
        }
        return answer
    }
    fun sum(a:Int , b:Int):Long{
        var sum: Long = 0
        for(i in a..b){
            sum += i
        }
        return sum
    }
}