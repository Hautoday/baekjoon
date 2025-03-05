import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int answer = 0;
		for (int i = 1; i <= A; i++) {
			answer += i;
		}
		System.out.println(answer);
	}

}