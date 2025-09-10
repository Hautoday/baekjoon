class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!check[i]){
                dfs(computers,i,check);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computer, int i, boolean[] check){
        check[i] = true;
        for(int j = 0; j < computer.length; j++){
            if(i != j && computer[i][j] == 1 && !check[j]){
                dfs(computer,j,check);
            }
        }
    }
}