import java.util.Stack;
class Solution {
    public int solution(String s) {
        // stack을 활용해야함.
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            s = rotation(s);
            if(check(s)){
                answer++;
            }
        }
        return answer;
    }
    // 문자열을 로테이션하는 함수
    public String rotation(String str){
        return str.substring(1) + str.charAt(0);
    }
    // 문자열을 검사하는 함수.
    public boolean check(String str){
        // Stack 사용이유 
        // 문자를 하나씩 꺼내어 검사하기 위함 .peek()
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                  stack.push(str.charAt(i));
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                
                if(str.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(str.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(str.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}