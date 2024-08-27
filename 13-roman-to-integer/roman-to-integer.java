import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int x = 0;
        int i = s.length() - 1;
        
        while (i >= 0) {
            if (s.charAt(i) == 'I') {
                x = 1;
                i--;
            } else if (s.charAt(i) == 'V') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
                    x = 4;
                    i -= 2;
                } else {
                    x = 5;
                    i--;
                }
            } else if (s.charAt(i) == 'X') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
                    x = 9;
                    i -= 2;
                } else {
                    x = 10;
                    i--;
                }
            } else if (s.charAt(i) == 'L') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
                    x = 40;
                    i -= 2;
                } else {
                    x = 50;
                    i--;
                }
            } else if (s.charAt(i) == 'C') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
                    x = 90;
                    i -= 2;
                } else {
                    x = 100;
                    i--;
                }
            } else if (s.charAt(i) == 'D') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
                    x = 400;
                    i -= 2;
                } else {
                    x = 500;
                    i--;
                }
            } else if (s.charAt(i) == 'M') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
                    x = 900;
                    i -= 2;
                } else {
                    x = 1000;
                    i--;
                }
            }
            res += x;
        }
        
        return res;
    }
}
