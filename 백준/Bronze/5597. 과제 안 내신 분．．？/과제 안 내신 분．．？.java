import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] play = new int[28];
		boolean con = false;
		for (int i = 0; i < play.length; i++) {
			play[i] = sc.nextInt();
		}
		for (int i = 1; i < 31; i++) {
			boolean val = contains(play, i);
			if( val != true) {
				System.out.println(i);
			}
		}
	}
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}