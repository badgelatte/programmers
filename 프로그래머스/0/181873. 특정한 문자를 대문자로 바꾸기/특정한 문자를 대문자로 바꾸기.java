class Solution {
    public String solution(String my_string, String alp) {
        String capitalLetter = alp.toUpperCase();
        return my_string.replaceAll(alp, capitalLetter);
    }
}