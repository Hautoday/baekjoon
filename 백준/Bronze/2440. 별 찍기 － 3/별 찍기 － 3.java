import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int star = s.nextInt();
		for (int i = 0; i < star; i++) {
			for (int j = i; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}