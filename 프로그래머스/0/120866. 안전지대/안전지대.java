import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        int[][]arr = new int[length + 2][length + 2];
        for(int i = 0; i < length; i++){
            Arrays.fill(arr[i],0);
        }
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(board[i][j] != 0){
                    for(int x = -1; x <= 1; x++){
                        for(int y = -1; y <= 1; y++){
                            arr[i+x+1][j+y+1]++;
                        }
                    }
                }
            }
        }
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= length; j++){
                if(arr[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}