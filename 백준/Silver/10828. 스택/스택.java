import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        Stack<String> stackStr = new Stack<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.hasMoreTokens()) {
                str = st.nextToken();
                switch (str) {
                    case "push":
                        stackStr.push(st.nextToken());
                        break;
                    case "pop":
                        if (!stackStr.isEmpty()) {
                            System.out.println(stackStr.pop());
                            break;
                        }else{
                            System.out.println("-1");
                            break;
                        }
                    case "size":
                        System.out.println(stackStr.size());
                        break;
                    case "empty":
                        if (!stackStr.isEmpty()) {
                            System.out.println("0");
                            break;
                        }else{
                            System.out.println("1");
                            break;
                        }
                    case "top":
                        if (!stackStr.isEmpty()) {
                            System.out.println(stackStr.peek());
                            break;
                        }else{
                            System.out.println("-1");
                            break;
                        }

                }
            }
        }
    }
}