import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> arr = new PriorityQueue<>(Comparator.reverseOrder());
        int number = 0;
        for (int i = 0; i < M; i++) {
            number = Integer.parseInt(br.readLine());
            if (number>0) {
                arr.add(number);
            } else {
                if (!arr.isEmpty()) {
                    System.out.println(arr.poll());
                }
                else{
                    System.out.println(0);
                }
            }
        }
    }
}

