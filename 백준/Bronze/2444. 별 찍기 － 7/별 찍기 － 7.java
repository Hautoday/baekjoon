import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int star = s.nextInt();
		for (int i = 0; i < star; i++) {
			for (int j = 1; j < star-i; j++) {
				if(j-i > star-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			  for (int j=0; j<i*2+1; j++) {
			    	System.out.print("*");
			    }
			System.out.println();
		}
		for (int i = 1; i < star; i++) {
			for (int j=0; j<star; j++) {
				if(j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for (int j=0; j<star; j++) {
				if(j < star-1-i) {System.out.print("*");}
			}
			System.out.println();
		}
	}
}