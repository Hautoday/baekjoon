import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int total = 1;
		int money = 0;
		while(money >= 0) {
			money = s.nextInt();
			total += money;
		}
		System.out.println(total);
	}
}