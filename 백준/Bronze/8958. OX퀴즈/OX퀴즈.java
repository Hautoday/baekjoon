import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int number = s.nextInt();
	    int count = 1;
	    int total = 0;
	    String[] str = new String[number];
		for (int i = 0; i < number; i++) {
			str[i] = s.next();
		}		
		for (int k = 0; k < number; k++) {
			for (int j = 0; j < str[k].length(); j++) {
				if(str[k].charAt(j) == 'O') {
					total += count;
					count++;
				}else {
					count = 1;
				}
			}
			System.out.println(total);
			total = 0;
			count = 1;
		}
    }
}