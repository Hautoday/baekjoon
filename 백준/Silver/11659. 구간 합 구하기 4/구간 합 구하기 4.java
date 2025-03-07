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
        StringBuilder sb = new StringBuilder();
        long[] arr = new long[N + 1];
        st = new StringTokenizer(br.readLine());


        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i-1] + Long.parseLong(st.nextToken());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            long total = arr[end] - arr[start - 1];
            sb.append(total).append("\n");
        }
        System.out.println(sb);
    }
}