import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Integer[][] RGB = new Integer[N][3];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                RGB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1; i < N; i++){
                RGB[i][0] += Math.min(RGB[i-1][1],RGB[i-1][2]);
                RGB[i][1] += Math.min(RGB[i-1][0],RGB[i-1][2]);
                RGB[i][2] += Math.min(RGB[i-1][0],RGB[i-1][1]);
        }
        answer = Math.min(Math.min(RGB[N-1][0],RGB[N-1][1]),RGB[N-1][2]);
        System.out.println(answer);
    }
}