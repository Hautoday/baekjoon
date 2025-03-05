import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String reverse1 = "";
		String reverse2 = "";
		for (int i = a.length() - 1; i >= 0; i--){            
			reverse1 = reverse1 + a.charAt(i);
			reverse2 = reverse2 + b.charAt(i);
		}
		int a1 = Integer.parseInt(reverse1);
		int b1 = Integer.parseInt(reverse2);
		if(a1 > b1) {
			System.out.println(a1);
		}else {
			System.out.println(b1);
		}
	}
}