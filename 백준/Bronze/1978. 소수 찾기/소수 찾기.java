import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] answer = new boolean[1001];
        int count = 0;
        answer[0] = true;
        answer[1] = true;

        for (int i = 2; i < answer.length; i++) {
            if (answer[i] == true) {
                continue;
            }

            for (int j = i + i; j < answer.length; j = j + i){
                answer[j] = true;
            }
        }
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (answer[n] == true) {
                continue;
            }
            count++;

        }
        System.out.println(count);
    }
}