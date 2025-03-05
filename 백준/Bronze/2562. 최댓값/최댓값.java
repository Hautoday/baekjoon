import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int[] numbers = new int[9];
		int selectNumber = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextInt();
		}
		selectNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(selectNumber < numbers[i]) {
				selectNumber = numbers[i];
				count = i;
			}
		}
		System.out.println(selectNumber);
		System.out.println(count+1);
    }
}
