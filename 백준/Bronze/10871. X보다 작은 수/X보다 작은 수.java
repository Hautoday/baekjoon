import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int total = s.nextInt();
		int select = s.nextInt();
		int[] answer = new int[total];
		for (int i = 0; i < total; i++) {
			answer[i] = s.nextInt();
		}
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] < select) {System.out.println(answer[i]);}
		}
    }
}