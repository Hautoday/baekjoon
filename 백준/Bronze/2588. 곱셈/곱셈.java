import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] answer = new int[3];
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int swap = 0;
		for (int i = 0; i < 3; i++) {
			swap = num2%10;
			num2 = num2/10;
			answer[i] = num1 * swap;
			System.out.println(answer[i]);
		}
		swap = 0;
		num1 = 1;
		for (int i = 0; i < 3; i++) {
			swap += answer[i] * num1;
			num1 *= 10;
		}
		System.out.println(swap);
	}
}