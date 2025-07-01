class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] b_str1 = new String[n];
        String[] b_str2 = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = "";
            b_str1[i] = Integer.toBinaryString(arr1[i]);
            b_str2[i] = Integer.toBinaryString(arr2[i]);
            while(true){
                if(b_str1[i].length() != n){
                    b_str1[i] = "0" + b_str1[i];
                }else if(b_str2[i].length() != n){
                    b_str2[i] = "0" + b_str2[i];
                }else{
                    break;   
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char check1 = b_str1[i].charAt(j);
                char check2 = b_str2[i].charAt(j);
                if(check1 == '1' || check2 == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}