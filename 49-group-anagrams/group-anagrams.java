import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray(); // Convert String to char array
            Arrays.sort(chars); // Sort the char array
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

}