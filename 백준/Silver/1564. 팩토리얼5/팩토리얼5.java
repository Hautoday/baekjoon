import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long mod = (long)1e12;
        int number = Integer.parseInt(br.readLine());
        long[] arr = new long[number + 1];
        long num;
        arr[1] = 1;
        
        for (int i = 2; i <= number; i++) {
			arr[i] = arr[i-1] * i;
			while(arr[i] % 10 == 0) {
				arr[i] /= 10;
			}
			arr[i] %= mod;
		}
        num = arr[number] % 100000;
        System.out.printf("%05d", num);
    }
}
