class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] str = {};
        for(int i = 0; i < quiz.length; i++){
            str = quiz[i].split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[str.length-1]);
            if(str[1].equals("-")){ 
                if(x-y == z){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(str[1].equals("+")){
                if(x+y == z){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}