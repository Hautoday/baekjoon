import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < clothes.length; i++){
            String str = clothes[i][1];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        Iterator<Integer> iter = map.values().iterator();
        while(iter.hasNext()){
            answer *= iter.next().intValue() + 1;
        }
        return answer-1;
    }
}