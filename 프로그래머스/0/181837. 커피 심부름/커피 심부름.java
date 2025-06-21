class Solution {
    public int solution(String[] order) {
        int bill = 0;
        
        for(String str : order) {
            if(str.contains("americano")) {
                bill += 4500;
            }
            if(str.contains("cafelatte")) {
                bill += 5000;
            }
            if(str.equals("anything")) {
                bill += 4500;
            }
        }
        
        return bill;
    }
}