import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>(); 
    for (String str : strs) { 
        char[]charArray = str.toCharArray(); Arrays.sort(charArray); // Sort characters in the string 
    String sortedStr = new String(charArray); // Create a sorted string key 
    map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
    } return new ArrayList<>(map.values()); 
    }
        

}