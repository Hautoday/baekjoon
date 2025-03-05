import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c - 3 < 65) {
				c = (char) (c - 3);
				c += 26;
				answer += c;
			}else {
				c -= 3;
				answer += c;
			}
		}
		System.out.println(answer);
	}
}