import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                listAddWithAmount(arr[i], list);
            }
            else {
                listRemoveWithAmount(arr[i], list);
            }
        }

        return listToArr(list);
    }

    public void listAddWithAmount(int amount, List<Integer> list) {
        int now = amount * 2;

        while(now-- > 0) {
            list.add(amount);
        }
    }

    public void listRemoveWithAmount(int amount, List<Integer> list) {
        int now = amount;

        while(now-- > 0) {
            list.remove(list.size() - 1);
        }
    }

    public int[] listToArr(List<Integer> list) {
        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}