import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> arr = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) {
                    if (o1 < o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }else{
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        int number = 0;
        for (int i = 0; i < M; i++) {
            number = Integer.parseInt(br.readLine());
            if (number==0) {
                if(arr.isEmpty())
                    sb.append("0").append("\n");
                else
                    sb.append(arr.poll()).append("\n");
            }else{
                arr.add(number);
            }
        }
        System.out.println(sb);
    }
}

