import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        
        if(length == 1) {
            return OneSpace(board[0][0]);
        }
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                int outlines = 0;
                if((outlines = isDangerous(i, j, board)) > 0) {
                    board = checkDangerous(i, j, board, outlines);
                }
            }
        }
        
        return safeSpaceCount(board);
    }
    
    public int OneSpace(int space) {
        if(space == 0) {
            return 1;
        }
        return 0;
    }
    
    public int isDangerous(int row,int column, int[][] board) {
        int space = 0;
        if(board[row][column] == 0 || board[row][column] == -1) {
            return 0;
        }
        
        space++;
        
        if(row == 0) {
            space++;
        }
        if(column == 0) {
            space++;
        }
        if(row == board.length - 1) {
            space++;
        }
        if(column == board.length - 1) {
            space++;
        }
        
        return space;
    }
    
    public int[][] checkDangerous(int row, int column, int[][] board, int outlines) {
        if(outlines == 1) { // 테두리를 인접하지 않은 곳에서 지뢰 발견한 경우
            board[row - 1][column - 1] = (board[row - 1][column - 1] == 1 ? 1 : -1);
            board[row - 1][column] = (board[row - 1][column] == 1 ? 1 : -1);
            board[row - 1][column + 1] = (board[row - 1][column + 1] == 1 ? 1 : -1);
            board[row][column - 1] = (board[row][column - 1] == 1 ? 1 : -1);
            board[row][column + 1] = (board[row][column + 1] == 1 ? 1 : -1);
            board[row + 1][column - 1] = (board[row + 1][column - 1] == 1 ? 1 : -1);
            board[row + 1][column] = (board[row + 1][column] == 1 ? 1 : -1);
            board[row + 1][column + 1] = (board[row + 1][column + 1] == 1 ? 1 : -1);
            
            return board;
        }
        
        if(outlines == 2) { // 모서리가 아닌 테두리에 지뢰가 있는 경우
            if(row == 0) {
                board[0][column - 1] = (board[0][column - 1] == 1 ? 1 : -1);
                board[0][column + 1] = (board[0][column + 1] == 1 ? 1 : -1);
                board[1][column - 1] = (board[1][column - 1] == 1 ? 1 : -1);
                board[1][column] = (board[1][column] == 1 ? 1 : -1);
                board[1][column + 1] = (board[1][column + 1] == 1 ? 1 : -1);
            }
            if(column == 0) {
                board[row - 1][0] = board[row - 1][0] == 1 ? 1: -1;
                board[row - 1][1] = board[row - 1][1] == 1 ? 1 : -1;
                board[row][1] = board[row][1] == 1 ? 1 : -1;
                board[row + 1][0] = board[row + 1][0] == 1 ? 1 : -1;
                board[row + 1][1] = board[row + 1][1] == 1 ? 1 : -1;
            }
            if(row == board.length - 1) {
                board[row - 1][column - 1] = board[row - 1][column - 1] == 1 ? 1 : -1;
                board[row - 1][column] = board[row - 1][column] == 1 ? 1 : -1;
                board[row - 1][column + 1] = board[row - 1][column + 1] == 1 ? 1 : -1;
                board[row][column - 1] = board[row][column - 1] == 1 ? 1 : -1;
                board[row][column + 1] = board[row][column + 1] == 1 ? 1 : -1;
            }
            if(column == board.length - 1) {
                board[row - 1][column - 1] = board[row - 1][column - 1] == 1 ? 1 : -1;
                board[row - 1][column] = board[row - 1][column] == 1 ? 1 : -1;
                board[row][column - 1] = board[row][column - 1] == 1 ? 1 : -1;
                board[row + 1][column - 1] = board[row + 1][column - 1] == 1 ? 1 : -1;
                board[row + 1][column] = board[row + 1][column] == 1 ? 1 : -1;
            }
            
            return board;
        }
        
        // 모서리에 지뢰가 있는 경우
        if(row == 0) {
            board[1][column] = board[1][column] == 1 ? 1 : -1;
            if(column == 0) {
                board[0][1] = board[0][1] == 1 ? 1 : -1;
                board[1][1] = board[1][1] == 1 ? 1 : -1;
            } else {
                board[0][column - 1] = board[0][column - 1] == 1 ? 1 : -1;
                board[1][column - 1] = board[1][column - 1] == 1 ? 1 : -1;
            }
        }
        if(row == board.length - 1) {
            board[row - 1][column] = board[row - 1][column] == 1 ? 1 : -1;
            if(column == 0) {
                board[row][1] = board[row][1] == 1 ? 1 : -1;
                board[row - 1][1] = board[row - 1][1] == 1 ? 1 : -1;
            } else {
                board[row][column - 1] = board[row][column - 1] == 1 ? 1 : -1;
                board[row - 1][column - 1] = board[row - 1][column - 1] == 1 ? 1 : -1;
            }
        }
        
        return board;
    }
    public int safeSpaceCount(int[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
}