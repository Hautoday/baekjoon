import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str = br.readLine();
		int num = 9;
		int select1 = 0;
		int select2 = 10; 
		for (int i = 0; i < str.length(); i++) {
			if(str.length() - select1 < 10 ) {
				System.out.println(str.substring(select1));
				break;
			}
			if(i == num) {
				System.out.println(str.substring(select1,select2));
				num += 9;
				select1 = select2;
				select2 += 10;
			}
			
		}
	}
}