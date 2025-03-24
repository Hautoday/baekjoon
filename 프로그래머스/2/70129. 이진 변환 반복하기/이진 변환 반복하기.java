class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        String str = s;
        int number = 0;
        int count = 0;
        int DeleteCount = 0;
        
        while(true){
            for (int i = 0; i < str.length(); i++){
                    // 체크 된 1의 개수
                if(str.charAt(i) == '1'){
                    number += 1;
                }else{
                    // 제거 된 0의 개수
                    DeleteCount++;
                }
            }
            count++;
            if(number == 1){
                break;
            }
            str = Integer.toBinaryString(number);
            number = 0;
        }
        answer[0] = count;
        answer[1] = DeleteCount;
        return answer;
    }
}
