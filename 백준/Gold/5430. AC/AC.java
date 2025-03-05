import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack;

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String cmd = br.readLine();
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            stack = new ArrayDeque<>();
            for (int j = 0; j < num; j++) {
                stack.add(Integer.parseInt(st.nextToken()));
            }

            commend(cmd, stack);

        }
        System.out.println(sb.toString());

    }
    public static void commend(String cmd,Deque<Integer> stack){
        boolean flag = true;
        for (int i = 0; i < cmd.length(); i++) {
            if(cmd.charAt(i) == 'R'){
                flag = !flag;
                continue;
            }

            // 정배
            if(flag){
                if(stack.pollFirst() == null){
                    sb.append("error\n");
                    return;
                }
            }else{
                if(stack.pollLast() == null){
                    sb.append("error\n");
                    return;
                }
            }
        }
        answer(flag,stack);
    }
    public static void answer (boolean flag,Deque<Integer> stack){
        sb.append("[");
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if(flag){
                sb.append(stack.pollFirst()).append(stack.isEmpty() ? "" : ",");
            }else{
                sb.append(stack.pollLast()).append(stack.isEmpty() ? "" : ",");
            }
        }
        sb.append("]\n");
    }
}



