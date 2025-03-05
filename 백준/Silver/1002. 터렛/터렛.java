import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			
			if(x1 == x2 && y1 == y2 && r1 == r2) answer[i] = -1;
			else if(distance > Math.pow((r2 + r1), 2)) answer[i] = 0;
			else if(distance < Math.pow((r2 - r1), 2)) answer[i] = 0;
			else if(distance == Math.pow((r2 + r1), 2)) answer[i] = 1;
			else if(distance == Math.pow((r2 - r1), 2)) answer[i] = 1;
			else answer[i] = 2;
        }


        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
