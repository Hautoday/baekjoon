import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int total = 0;
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		char c;
		for (int i = 0; i < a; i++) {
			c = str.charAt(i);
			total += c - 64;
		}
		System.out.println(total);
	}
}