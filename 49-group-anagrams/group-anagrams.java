class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Create a frequency array for the characters in the string
            int[] frequency = new int[26]; // Assuming lowercase English letters
            for (char c : str.toCharArray()) {
                frequency[c - 'a']++;
            }

            // Convert the frequency array to a unique key
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (frequency[i] > 0) {
                    keyBuilder.append((char) ('a' + i)).append(frequency[i]);
                }
            }
            String key = keyBuilder.toString();

            // Group the original string with its frequency key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        // Return the grouped anagrams
        return new ArrayList<>(map.values());
    }

}