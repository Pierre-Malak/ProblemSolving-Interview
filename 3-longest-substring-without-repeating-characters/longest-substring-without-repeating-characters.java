class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength = 0; // Length of the longest substring without repeating characters
    int left = 0; // Left pointer of the window
    boolean[] charSet = new boolean[128]; // Array to track characters in the current window (ASCII characters)

    for (int right = 0; right < s.length(); right++) {
        char currentChar = s.charAt(right);

        // If the current character is already in the set, shrink the window from the left
        while (charSet[currentChar]) {
            charSet[s.charAt(left)] = false; // Remove the leftmost character from the set
            left++; // Move the left pointer to the right
        }

        // Add the current character to the set
        charSet[currentChar] = true;

        // Update the maximum length
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
    }
}