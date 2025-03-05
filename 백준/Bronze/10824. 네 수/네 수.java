import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = "";
		String str1 = "";
		long a = 0;
		long b = 0;
		for (int i = 0; i < 4; i++) {
			if(i < 2) {
				str += st.nextToken();
				a = Long.parseLong(str);
			}else{
				str1 += st.nextToken();
				b = Long.parseLong(str1);
			}
		}
		System.out.println(a+b);
	}
}