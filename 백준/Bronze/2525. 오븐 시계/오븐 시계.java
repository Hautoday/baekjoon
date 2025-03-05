import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		int m2 = s.nextInt();
		if(m + m2 < 60) {
			System.out.print(h+" ");
			System.out.print(m+m2);
		}else if(m + m2 >= 60){
			m2 = m + m2;
			h += m2 / 60;
			if(h >= 24) {
				h = h -24;
			}
			m = 0;
			m = m + (m2 % 60);
			System.out.print(h+" ");
			System.out.print(m);
		}
    }
}