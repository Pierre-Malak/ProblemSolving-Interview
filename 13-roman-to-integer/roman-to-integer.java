import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
     char[] romanChars = s.toCharArray();
        int response = 0;
        int previousNumber = 0;
        for(int i = romanChars.length - 1; i >= 0; i--) {
            int currentNumber = convertRomanToInt(romanChars[i]);
            if(currentNumber >= previousNumber) {
                response += currentNumber;
            } else {
                response -= currentNumber;
            }
            previousNumber = currentNumber;
        }
        return response;
    }

    public int convertRomanToInt(char roman) {
        int response = 0;
        switch(roman) {
            case 'I' -> {
                response = 1;
            }
            case 'V' -> {
                response = 5;
            }
            case 'X' -> {
                response = 10;
            }
            case 'L' -> {
                response = 50;
            }
            case 'C' -> {
                response = 100;
            }
            case 'D' -> {
                response = 500;
            }
            case 'M' -> {
                response = 1000;
            }
        }
        return response;
    }
}
