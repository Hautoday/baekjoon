import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		if(a <= 5) {
			System.out.println(1);
		}else {
			if( a % 5 == 0) {
				System.out.println((a/5));
			}else {
				System.out.println((a/5)+1);
			}
			
		}
	}
}