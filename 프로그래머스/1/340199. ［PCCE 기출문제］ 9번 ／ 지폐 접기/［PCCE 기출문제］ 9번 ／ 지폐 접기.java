class Solution {
    public int solution(int[] wallet, int[] bill) {
        int bigger = 0;
        int count = 0;
        
        if(wallet[0] < wallet[1]) {
            bigger = wallet[1];
        } else {
            bigger = wallet[0];
        }
        
        while (!smallerThanWallet(wallet, bill)) {
            bill = foldHalf(bill);
            count++;
        }
        
        return count;
    }
    
    public boolean smallerThanWallet (int[] wallet, int[] bill) {
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            return true;
        }
        else if (wallet[0] >= bill[1] && wallet[1] >= bill[0]) {
            return true;
        }
        
        return false;
    }
    
    public int[] foldHalf (int[] bill) {
        if(bill[0] < bill[1]) {
            bill[1] = bill[1] / 2;
            return bill;
        }
        bill[0] = bill[0] / 2;
        return bill;
    }
}