class Solution {
    public String solution(String rsp) {
        String[] rsps = rsp.split("");
        String answer = "";
        for(String num: rsps) {
            if(num.equals("2")) {
                answer += "0";
            }
            if(num.equals("0")) {
                answer += "5";
            }
            if(num.equals("5")) {
                answer += "2";
            }
        }
        return answer;
    }
}