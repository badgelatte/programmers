import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[][] score) {
        double[] avgs = calculationAvg(score);
        
        double[] sortScores = avgComposition(avgs);
        
        return ranking(avgs, sortScores);
    }
    
    public double[] calculationAvg(int[][] scores) {
        double[] avgScore = new double[scores.length];
        
        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores[i].length; j++) {
                avgScore[i] += scores[i][j];
            }
            avgScore[i] /= scores[i].length;
        }
        
        return avgScore;
    }
    
    public double[] removeduplicate(double[] arr) {
        Set<Double> arrSet = new HashSet<>();

        for (double num : arr) {
            arrSet.add(num);
        }

        int count = arrSet.size();
        double[] result = new double[count];

        for (double num : arrSet) {
            result[--count] = num;
        }

        return result;
    }
    
    public double[] avgComposition(double[] avg) {
        double temp = 0;

        double[] compositions = removeduplicate(avg);
        
        for(int i = 0; i < compositions.length; i++) {
            int max = i;
            
            for(int j = i; j < compositions.length; j++) {
                if(compositions[max] < compositions[j]) {
                    max = j;
                }
            }
            if(max != 0) {
                temp = compositions[max];
                compositions[max] = compositions[i];
                compositions[i] = temp;
            }
        }
        
        return compositions;
    }
    
    public int[] ranking(double[] avgs, double[] sortScores) {
        int[] result = new int[avgs.length];
        int grade = 1;
        boolean isFirst = true;

        for(double sortScore : sortScores) {
            int count = 0;

            for(int i = 0; i< avgs.length; i++) {
                if(sortScore == avgs[i]) {
                    result[i] = grade;

                    if(isFirst) {
                        isFirst = false;
                    } 
                    else {
                        count++;
                    }
                }
            }
            grade++;
            grade += count;
            isFirst = true;
        }

        return result;
    }
}