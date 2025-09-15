import java.util.Arrays;

class Solution {
    public String solution(long n, String[] bans) {
        String answer = "";
        // a - z : 26
        // aa - az : 26 + ba - bz : 26 ... za - zz = 26 ^ 2
        // aaa - aaz : 26 + aba - abz : 26 + ... - azz = 26 ^ 2 +
        // -> baa - baz : 26 + bba - bbz : 26 ... - bzz = 26 ^ 2
        // -> aaa - zzz : 26 ^ 3

        long[] banNums = new long[bans.length];

        // bans -> long로 변형
        for (int i = 0; i < bans.length; i++) {
            banNums[i] = strToLong(bans[i]);
        }
        Arrays.sort(banNums);

        // 주문 지우기
        for (long num : banNums) {
            if (n >= num) {
                n++;
            }
        }

        // n -> string으로 변경
        return longToStr(n);
    }

    public long strToLong(String str) {
        char[] letters = str.toCharArray();
        long result = 0;

        for(int i = 0; i < letters.length; i++) {
            result += (letters[letters.length - 1 - i] - 96) * (long) (Math.pow(26, i));
        }

        return result;
    }

    public String longToStr(long num) {
        int length = 0;
        int count = 0;
        boolean flag = false;

        // str 총 길이 확인
        long num2 = num;
        
        while(0 < num2) {
            num2 /= 26;
            length++;
        }
        

        char[] letters = new char[length];

        // 숫자에서 글자(아스키코드)로 치환        
        for (int i = letters.length; i > 0; i--) {
            num2 = num;
            count = 0;
            length--;

            while(length > count) {
                num2 /= 26;
                count++;
            }

            letters[i - 1] = (char) (num2 + 96);
            num -= num2 * (long) Math.pow(26, count);
        }

        // z 글자로 인한 오류 정정 구간
        for(int i = 0; i < letters.length - 1; i++) {
            if(letters[i] - 'a' < 0) {
                letters[i + 1] = (char) (letters[i + 1] - 'a' + 96);
                letters[i] = 'z';
            }
        }

        if(letters[letters.length - 1] - 'a' < 0) {
            letters = Arrays.copyOf(letters, letters.length - 1);
        }

        return addChar(letters);
    }

    public String addChar(char[] arr) {
        String str = "";

        for(int i = arr.length - 1; i >= 0; i--) {
            str += arr[i];
        }

        return str;
    }
}