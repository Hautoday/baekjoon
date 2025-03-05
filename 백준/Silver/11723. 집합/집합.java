import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        String str="";
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int num = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            switch (str) {
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)){sb.append(1);;}
                    else{sb.append(0);;}
                    sb.append("\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)){set.remove(num);}
                    else{set.add(num);}
                    break;
                case "all":
                    set = new HashSet<>();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}