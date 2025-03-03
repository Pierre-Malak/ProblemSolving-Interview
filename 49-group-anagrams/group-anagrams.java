import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      Map<String, List<String>> map = new HashMap<>();

      for (String str : strs) {
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c-'a']++;
            }
            String charCountString = Arrays.toString(charCount);
            map.computeIfAbsent(charCountString,k-> new ArrayList<>()).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
    

}