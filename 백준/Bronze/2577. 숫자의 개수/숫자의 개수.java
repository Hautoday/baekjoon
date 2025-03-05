import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = 1;
		int answer = 0;
		int[] arr = new int[10];
		for(int i = 0; i < 3;i++) {
			num *= s.nextInt();
		}
		s.close();
		
		while(num > 0) {
			answer = num % 10;
			num /= 10;
			switch(answer) {
				case 0:
					arr[0]++;
					break;
				case 1:
					arr[1]++;
					break;
				case 2:
					arr[2]++;
					break;
				case 3:
					arr[3]++;
					break;
				case 4:
					arr[4]++;
					break;
				case 5:
					arr[5]++;
					break;
				case 6:
					arr[6]++;
					break;
				case 7:
					arr[7]++;
					break;
				case 8:
					arr[8]++;
					break;
				case 9:
					arr[9]++;
					break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}