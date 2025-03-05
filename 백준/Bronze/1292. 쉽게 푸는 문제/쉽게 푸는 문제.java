import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int answer = 0;
		int count = 0;
		for (int i = 0; i <= b; i++) {
			for (int j = 0; j < i; j++) {
				count++;
				if(count >= a && count <= b) {
					answer += i;
				}
				
			}
		}
		System.out.println(answer);
	}
}