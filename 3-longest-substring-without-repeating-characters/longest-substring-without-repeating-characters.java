class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength = 0; // Length of the longest substring without repeating characters
    int left = 0; // Left pointer of the window
    Map<Character, Integer> charIndexMap = new HashMap<>(); // Map to store the last index of each character

    for (int right = 0; right < s.length(); right++) {
        char currentChar = s.charAt(right);

        // If the current character is already in the map, move the left pointer
        if (charIndexMap.containsKey(currentChar)) {
            left = Math.max(left, charIndexMap.get(currentChar) + 1);
        }

        // Update the last index of the current character
        charIndexMap.put(currentChar, right);

        // Update the maximum length
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
    }
}