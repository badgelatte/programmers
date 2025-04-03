class Solution {
    public int solution(int price) {
        if(price >= 100000 && price < 300000) {
            return price * 95 / 100;
        }
        if(price >= 300000 && price < 500000) {
            return price * 9 / 10;
        }
        if(price >= 500000) {
            return price * 8 / 10;
        }
        return price;
    }
}