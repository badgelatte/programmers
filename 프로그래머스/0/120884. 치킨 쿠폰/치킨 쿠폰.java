class Solution {
    public int solution(int chicken) {
        int[] order = new int[2];
        
        calculateChicken(order, chicken);
        
        return order[0];
    }
    
    public int[] calculateChicken(int[] order, int chicken) {
        order[0] += chicken / 10;
        order[1] += chicken % 10;
        chicken /= 10;
        
        if(chicken > 0) {
            calculateChicken(order, chicken);
            cupon(order);
        }
        
        return order;
    }
    
    public int[] cupon(int[] order) {
        if(order[1] >= 10) {
            order[0]++;
            order[1] -= 9;
        }
        
        return order;
    }
}