class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for(String d : babbling) {
            for(String word : words) {
                if(d.contains(word)) {
                    d = d.replace(word, ",");
                }
            }
            d = d.replaceAll(",","");
            if(d.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}