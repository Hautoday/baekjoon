import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        int arr = numbers.length;
        int[] answer = new int[arr];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        // stack을 활용하여 자리에 큰 수 넣기
        for (int i = 1; i < arr; i++){
            // 만약 stack이 비어있지 않고 앞숫자보다 뒷숫자가 더 크면 
            // stack에 들어있는 숫자값의 배열에 numbers[i]값 넣기.
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
            // 이를통해 값이 없는 애들을 제외하고 큰 숫자만 들어가게 됨.
        }
        // stack이 비어있지 않으면 해당 자리는 뒤에 큰 숫자가 없기 때문에 -1을 넣는다.
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        return answer;
    }
}
// 시간복잡도... 
// class Solution {
//     public int[] solution(int[] numbers) {
//         int[] answer = new int[numbers.length];
//         int arr = numbers.length;
//         for (int i = 0; i < arr; i++){
//             answer[i] = -1;
//             int num = numbers[i];
//             for(int j = i+1; j < arr; j++){
//                 if(num < numbers[j]){
//                     answer[i] = numbers[j];
//                     break;
//                 }else if( num > numbers[j]){
//                     continue;
//                 }
//             }
//         }
//         return answer;
//     }
// }