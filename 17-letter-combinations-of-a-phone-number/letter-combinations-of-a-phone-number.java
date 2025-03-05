class Solution {
    public List<String> letterCombinations(String digits) {
        // Edge case: If the input is empty, return an empty list
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        // Mapping of digits to letters
        String[] phoneMap = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), phoneMap, result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, String[] phoneMap, List<String> result) {
        // Base case: If the current combination is complete, add it to the result
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        char digit = digits.charAt(index);
        String letters = phoneMap[digit - '0'];

        // Try all possible letters for the current digit
        for (char letter : letters.toCharArray()) {
            current.append(letter); // Choose the current letter
            backtrack(digits, index + 1, current, phoneMap, result); // Explore further
            current.deleteCharAt(current.length() - 1); // Backtrack: Remove the last letter
        }
    }
}