class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            result.append(my_string.charAt(i));
        }
        return result.toString();
    }
}