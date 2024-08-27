import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer> romanValues = new HashMap<>();
        romanValues.put ('I' , 1);
        romanValues.put ('V', 5);
        romanValues.put ('X' ,10 );
        romanValues.put ('L' ,50 );
        romanValues.put ('C' ,100 );
        romanValues.put ('D' ,500 );
        romanValues.put ('M' , 1000 );
        int result = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && romanValues.get(arr[i]) < romanValues.get(arr[i + 1])) {
                result -= romanValues.get(arr[i]);
            } else {
                result += romanValues.get(arr[i]);
            }
        }
        return result;
    }
}
