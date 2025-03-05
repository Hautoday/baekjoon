import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int f1 = 0;
		int f2 = 1;
		int answer = 0;
 		for(int i = 0; i <= a; i++) {
 			if(i <= 1) {
 			   answer = i;
 			} else {
 			  answer = f1 + f2 ;
 			  if(i % 2 == 0) {
 				 f1 = answer;	
 			  }else {
 				 f2 = answer;	
 			  }
 			}
 		}
 		System.out.println(answer);
	}
}