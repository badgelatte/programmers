import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = Arrays.stream(rank)
                                    .boxed()
                                    .collect(Collectors.toList());

        int[] students = calculStudents(list, attendance);

        return 10000 * students[0] + 100 * students[1] + students[2];
    }
    
    public int[] calculStudents(List<Integer> rank, boolean[] attendance) {
        int[] students = new int[rank.size()];
        int[] involved3 = new int[3];
        // 참가하지 않는 학생 수
        int count = 0;
        
        for(int i = 0; i < rank.size(); i++) {
            if(attendance[i]) {
                students[i] = rank.get(i);
            }
            else {
                students[i] = 0;
                count++;
            }
        }
        
        Arrays.sort(students);
        
        for(int i = count; i < students.length && i < count + 3; i++) {
            int student = students[i];
            int index = rank.indexOf(student);
            involved3[i - count] = index;
        }
        
        return involved3;
    }
}