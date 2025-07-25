class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int x = -1;
        int y = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0){
                    x++;
                }else if(i % 3 == 1){
                    y++;
                }else if(i % 3 == 2){
                    x--;
                    y--;
                }
                arr[x][y] = count++;
            }
        }
        int[] answer = new int[count-1];
        x = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    break;
                }else{
                    answer[x++] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}