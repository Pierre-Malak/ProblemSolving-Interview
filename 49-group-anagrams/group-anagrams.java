import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Return an anonymous class extending AbstractList<List<String>>
        // This allows lazy initialization, meaning the computation is done only when needed.
        return new AbstractList<List<String>>() {
            // Declare a variable to hold the final grouped anagrams
            List<List<String>> ans;

            // get(int index) method to retrieve an anagram group at a specific index
            @Override
            public List<String> get(int index) {
                // If the ans list is not initialized, call init() to compute it
                if (ans == null) init();
                // Return the requested anagram group
                return ans.get(index);
            }

            // size() method to return the number of anagram groups
            @Override
            public int size() {
                // If the ans list is not initialized, call init() to compute it
                if (ans == null) init();
                // Return the number of groups
                return ans.size();
            }

            // The init() method is responsible for computing the grouped anagrams
            public void init() {
                // Create a HashMap to store anagram groups
                // Key: A unique string representation of character frequency
                // Value: A list of words that belong to this anagram group
                Map<String, List<String>> hm = new HashMap<>();

                // Iterate through each word in the input array
                for (String s : strs) {
                    // Create a frequency array to count occurrences of each letter
                    char[] count = new char[26]; // 26 for lowercase 'a' to 'z'

                    // Iterate through each character in the word
                    for (char c : s.toCharArray()) {
                        count[c - 'a']++; // Increment the count for this character
                    }

                    // Convert the frequency array into a unique key (String)
                    // This ensures words with the same letter distribution get the same key
                    String key = new String(count); 

                    // If the key is not already in the HashMap, create a new list
                    // computeIfAbsent avoids explicit if-else checks
                    hm.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
                }

                // Convert the values of the HashMap (list of grouped anagrams) into a List
                ans = new ArrayList<>(hm.values());
            }
        };
    }

}