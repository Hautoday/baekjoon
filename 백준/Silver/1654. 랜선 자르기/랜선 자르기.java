import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        long left = 1;
        long right = -1;
        long mid = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }
        if (M > 1 || N > 1) {
            while(left <= right) {
                mid = (left + right) / 2;
                long len = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i] >= mid) {
                        len += arr[i] / mid;
                    }
                }
                if (len >= M) {
                    left = mid + 1;
                }else if(len < M){
                    right = mid - 1;
                }
            }
            System.out.println(right);
        }else{
            System.out.println(arr[0]);
        }
    }
}