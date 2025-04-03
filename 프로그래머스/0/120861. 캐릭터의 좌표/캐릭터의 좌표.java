class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] location = {0, 0};
        
        for(String key: keyinput) {
            location = move(key, location, board);
        }
        
        return location;
    }
    
    public int[] move(String key, int[] location, int[] board) {
        if(key.equals("up") && (location[1] != board[1] / 2)) {
            location[1]++;
        }
        
        if(key.equals("down") && (location[1] != board[1] / 2 * -1)) {
            location[1]--;
        }
        
        if(key.equals("left") && (location[0] != board[0] / 2 * -1)) {
            location[0]--;
        }
        
        if(key.equals("right") && (location[0] != board[0] / 2)) {
            location[0]++;
        }

        return location;
    }
}