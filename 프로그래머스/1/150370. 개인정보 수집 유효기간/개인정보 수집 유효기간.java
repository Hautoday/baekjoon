import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int Del_Day = D_Day(today);
        HashMap<String, Integer> map = new HashMap<>();
        for(String term : terms){
            String[] str = term.split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }
        for(int i = 0; i < privacies.length; i++){
            String[] str = privacies[i].split(" ");
            if(D_Day(str[0]) + (map.get(str[1]) * 28) <= Del_Day){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
    public int D_Day(String today){
        String[] str = today.split("\\.");
        int year = Integer.parseInt(str[0]);
        int mon = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        return (year * 12 * 28) + (mon * 28) + day;
    }
}