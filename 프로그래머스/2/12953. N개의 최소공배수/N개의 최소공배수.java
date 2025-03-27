class Solution {
    public int solution(int[] arr) {
        // 유클리드 호제법을 사용하면 쉽게 풀 수 있는 문제.
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            int number = gcd(answer,arr[i]);
            answer = answer * arr[i] / number;           
        }
        return answer;
    }
    
    public static int gcd(int A, int B){
        int A_num = Math.max(A,B);
        int B_num = Math.min(A,B);
        while(A_num % B_num != 0){
            int temp = A_num % B_num;
            A_num = B_num;
            B_num = temp;
        }
        return B_num;
    }
}