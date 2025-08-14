class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int answer = 1; // 시작지점이 페인트를 사용해야하는 시작점임 1로 시작.
        for(int num : section){ // section을 하나씩 출력
            if(start + m > num){ // ex) 2+4 = 6 이 section보다 작아서 if문은 통과
                continue;        // ex) 3+4 = 7 임으로 section보다 크다 다시
            }
            start = num; // start = 3;
            answer++; // answer = 2;
        }
        return answer;
    }
}