import java.util.Arrays;
import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int member = s.nextInt();
		int cut = s.nextInt();
		int[] answer = new int[member];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.nextInt();
		}
		Arrays.sort(answer);
		System.out.println(answer[member - cut]);
		
		
	}
}