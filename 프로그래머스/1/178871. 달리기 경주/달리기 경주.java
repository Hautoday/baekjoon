import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> Player = new HashMap<>();
        HashMap<Integer, String> Rank = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            Player.put(players[i],i);
            Rank.put(i,players[i]);
        }
        for(int i = 0; i < callings.length; i++){
            int passplayer = Player.get(callings[i]);
            String player_name = Rank.get(passplayer);
            String frontplayer = Rank.get(passplayer - 1);
            Player.put(player_name, passplayer - 1);
			Player.put(frontplayer, passplayer);
			Rank.put(passplayer - 1, player_name);
			Rank.put(passplayer, frontplayer);
            
        }
        for (int i = 0; i < players.length; i++) {
			answer[i] = Rank.get(i);
		}
        return answer;
    }
}