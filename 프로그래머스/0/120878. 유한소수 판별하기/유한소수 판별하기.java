class Solution {
    public int solution(int a, int b) {
        int gcf = getGcf(a, b);
        a /= gcf;
        b /= gcf;
        
        int[] primeFactors = isPrimeFactor(b);
        
        if(primeFactors[0] == 0) {
            return 1;
        }
        
        for(int i = 0; i < primeFactors.length; i++) {
            if(primeFactors[i] != 2 && primeFactors[i] != 5 && primeFactors[i] != 0) {
                return 2;
            }
        }
        
        return 1;
    }
    
    public int getGcf(int a, int b) {
        int min = a < b ? a : b;
        int gcf = 1;
        
        for(int i = 2; i <= min; i++) {
            if(a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        
        return gcf;
    }
    
    public int[] isPrimeFactor(int n) {
        int[] primeFactors = new int[n];
        int count = 0;
        
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                n /= i;
                primeFactors[count++] = i;
            }
        }
        
        return primeFactors;
    }
}