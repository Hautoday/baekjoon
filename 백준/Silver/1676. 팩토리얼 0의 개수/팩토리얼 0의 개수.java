import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
class Main {
 public static void main(String[] args) throws IOException {
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     int number = Integer.parseInt(bf.readLine());
     int count = 0;
     while(number >= 5) {
    	 count += number / 5;
    	 number /= 5;
     }
     System.out.println(count);
    
 }
}