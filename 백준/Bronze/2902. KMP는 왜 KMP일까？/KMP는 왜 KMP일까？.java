import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		str = str.replaceAll("[^A-Z]", "");
		System.out.println(str);
	}
}