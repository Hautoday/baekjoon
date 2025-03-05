import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		String[] str = new String[a];
		for (int i = 0; i < str.length; i++) {
			st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
			if(str[i].length() >= 6 && str[i].length() <= 9) {
				str[i] = "yes";
			}else {
				str[i] = "no";
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}