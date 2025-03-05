import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int[] arr = {s.nextInt(),s.nextInt(),s.nextInt()};
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}