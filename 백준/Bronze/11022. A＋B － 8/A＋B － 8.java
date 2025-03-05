import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[] a = new int[count];
		int[] b = new int[count];
		int[] answer = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			answer[i] = a[i]+b[i];
		}
		int number = 1;
		for (int i = 0; i < answer.length; i++) {
			System.out.println("Case #"+number+": "+a[i]+" + "+b[i]+" = "+answer[i]);
			number++;
		}
    }
}