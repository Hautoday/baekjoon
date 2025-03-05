import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] answer = new int[26];
        Arrays.fill(answer, -1);
        int count = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (answer[c - 'a'] != -1){
                count++;
            }else{
                answer[c - 'a'] = count;
                count++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}