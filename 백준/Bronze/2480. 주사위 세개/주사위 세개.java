import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] dice = new int[3];
		for (int i = 0; i < dice.length; i++) {
			dice[i] = s.nextInt();
		}
		Arrays.sort(dice);
		if(dice[0] == dice[1] && dice[1] == dice[2]) {System.out.println( 10000 + ( dice[1] * 1000 ));}
		else if(dice[0] == dice[1] && dice[1] != dice[2]) {System.out.println( 1000 + ( dice[1] * 100));}
		else if(dice[0] != dice[1] && dice[1] == dice[2]){System.out.println( 1000 + ( dice[1] * 100));}
		else {System.out.println( dice[2] * 100);}
	}
}