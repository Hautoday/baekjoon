class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        for(String str : babbling){
            for(String word : words){
                str = str.replace(word," ");
            }
            str = str.replace(" ","");
            if(str == ""){
               answer++;
            }
        }
        return answer;
    }
}