import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int classmate = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < a; i++) {
			classmate = s.nextInt();
			if(classmate == 0) {
				b++;
			}else {
				c++;
			}
		}
		if(b > c) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}
	}
}