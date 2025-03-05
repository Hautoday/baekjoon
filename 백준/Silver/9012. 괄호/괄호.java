import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		String str[] = new String[a];
		
		for (int i = 0; i < a; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			str[i] = st1.nextToken();
		}
		
		for (int i = 0; i < str.length; i++) {
			str[i] = soluttion(str[i]);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	public static String soluttion(String s) {
		int count = 0;
		if (s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					count++;
				}else {
					count--;
				}
				if( count < 0) {
					return "NO";
				}
			}
			if (count == 0) {
				return "YES";
			}
		}
		return "NO";
	}

}