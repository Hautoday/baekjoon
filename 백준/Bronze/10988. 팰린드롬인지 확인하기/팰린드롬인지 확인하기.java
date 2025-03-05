import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int b = str.length()-1;
		boolean answer = true;
		for (int i = 0; i < b; i++) {
			if(str.charAt(i) != str.charAt(b)) {
				answer = false;
				break;
			}
			b--;
		}
		if(answer == false) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
		
	}
}
