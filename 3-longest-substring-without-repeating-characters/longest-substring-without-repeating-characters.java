class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int maxLength=0;
        char[] arrayChar = s.toCharArray();
        int firstPointer = 0;
        HashSet<Character> set = new HashSet();
        for(int secondPointer = 0 ; secondPointer< s.length(); secondPointer++){
            while(set.contains(s.charAt(secondPointer))){
                set.remove(s.charAt(firstPointer));
                firstPointer++;

            }
            set.add(s.charAt(secondPointer));
            maxLength = Math.max(maxLength,secondPointer - firstPointer+1);

        }
        return maxLength;
    }
}