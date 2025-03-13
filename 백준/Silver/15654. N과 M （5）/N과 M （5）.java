import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int M,N;
    static StringBuilder sb = new StringBuilder();
    static int[] arr, answer;
    static boolean[] state;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];
        answer = new int[N];
        state = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);

        System.out.print(sb.toString());
    }

    public static void dfs(int index) {
       if (index == M){
           for (int i = 0; i < M; i++){
               sb.append(answer[i]).append(" ");
           }
           sb.append("\n");
           return;
       }

       for (int i = 0; i < N; i++) {
           if(state[i]){
               continue;
           }else{
               state[i] = true;
               answer[index] = arr[i];
               dfs(index + 1);
               state[i] = false;
           }
       }
    }

}