import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		System.out.println((A + B) - C);
		String str = Integer.toString(A) + Integer.toString(B);
		A = Integer.parseInt(str);
		System.out.println(A - C);
	}
}

