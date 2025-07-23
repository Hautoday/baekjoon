class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            String str = dic[i];
            int count = 0;
            if(str.length() >= spell.length){
                for(int j = 0; j < spell.length; j++){
                    if(str.contains(spell[j])){
                        count++;
                    }
                }
            }else{
                continue;
            }
            if(str.length() == count){
                answer = 1;
            }
        }
        return answer;
    }
}