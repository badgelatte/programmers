import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int[][] drawingLines = generateLines(lines);

        int[] overlaps = drawingOverlaps(drawingLines);

        return countRange(overlaps);
    }
    
    public int[][] generateLines(int[][] lines) {
        int[][] drawingLines = new int[3][200];
        
        for(int i = 0; i < lines.length; i++) {
            int count = 0;
            int location = lines[i][0];
            int length = lines[i][1] - lines[i][0];
            drawingLines[i] = new int[length];
            
            while(lines[i][1] > location) {
                drawingLines[i][count++] = location++;
            }
        }
        
        return drawingLines;
    }
    
    public int[] drawingOverlaps(int[][] lines) {
        int addLengths = lines[0].length + lines[1].length + lines[2].length;

        int[] overlaps = new int[addLengths];
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            for(int j = 0; j < lines[i].length; j++) {
                overlaps[count++] = lines[i][j];
            }
        }

        Arrays.sort(overlaps);
        return overlaps;
    }
    
    public int countRange(int[] range) {
        int result = 0;
        
        if(range[0] == range[1]) {
            result++;
        }

        for (int i = 1; i < range.length - 1; i++) {
            if(range[i - 1] != range[i] && range[i] == range[i + 1]) {
                result++;
            }
        }

        return result;
    }
}