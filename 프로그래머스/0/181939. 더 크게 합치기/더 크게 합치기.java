class Solution {
    public int solution(int a, int b) {
        int ab = Integer.valueOf(a + "" + b);
        int ba = Integer.valueOf(b + "" + a);
        int answer = (ab > ba) ? ab: ba;
        return answer;
    }
}