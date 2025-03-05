import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int a;
		int b;
		int[] answer = new int[count];
		for (int i = 0; i < count; i++) {
			a = s.nextInt();
			b = s.nextInt();
			answer[i] = a+b;
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
    }
}