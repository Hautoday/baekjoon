import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String[][] str = new String[num][2];
		for (int i = 0; i < num; i++) {
			str[i][0] = s.next();
			str[i][1] = s.next();
		}
		Arrays.sort(str, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		for (int i = 0; i < num; i++) {
			System.out.println(str[i][0] + " " + str[i][1]);
		}
	}
}