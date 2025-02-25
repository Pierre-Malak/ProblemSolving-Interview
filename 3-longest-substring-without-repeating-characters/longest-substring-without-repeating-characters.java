class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int left = 0;
    boolean[] arrayChar = new boolean[128];
    for (int right =0 ; right < s.length(); right++){
        char currentChar = s.charAt(right);
        while(arrayChar[currentChar]){
            arrayChar[s.charAt(left)] = false;
            left++;
        }
        arrayChar[currentChar] = true;
        maxLength = Math.max(maxLength, right - left +1);
    }
    return maxLength;

    }
}