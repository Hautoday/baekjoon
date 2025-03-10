import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int[] answer = new int[M];
        int count = 0;

        for (int i = 1; i < M - 1; i++) {
            if (arr[i] == 'O' && arr[i + 1] == 'I') {
                answer[i + 1] = answer[i - 1] + 1;
                if (answer[i + 1] >= N && arr[i - 2 * N + 1] == 'I')
                    count++;
            }
        }
        System.out.println(count);
    }
}