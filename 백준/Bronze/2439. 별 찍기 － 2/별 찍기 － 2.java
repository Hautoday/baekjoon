import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String answer = "*";
		int A = s.nextInt();
		for (int i = 0; i < A; i++) {
			for (int j = A-1; j >= 0 ; j--) {
				if(i >= j ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}