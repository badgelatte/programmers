class Solution {
    public String[] solution(String[] picture, int k) {
        String[] enlargedImage = new String[picture.length * k];
        
        for(int i = 0; i < enlargedImage.length; i++) {
            enlargedImage[i] = enlargedStr(picture[i/k], k);
        }
        
        return enlargedImage;
    }
    
    public String enlargedStr(String pic, int k) {
        String[] letters = pic.split("");
        String result = "";
        int count = 0;
        
        for(int i = 0; i < letters.length; i++) {
            while(count++ < k) {
                result += letters[i];
            }
            
            count = 0;
        }
        
        return result;
    }
}