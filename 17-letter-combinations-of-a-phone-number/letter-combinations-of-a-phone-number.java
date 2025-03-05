class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length()==0){
            return new ArrayList<>();
        }
        String[]phoneMap = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
       List<String> result = new ArrayList<>();
       backtrack(digits,0,new StringBuilder(),phoneMap,result);
       return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, String[] phoneMap, List<String> result) {
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = phoneMap[digit - '0'];
        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(digits, index + 1, current, phoneMap, result);
            current.deleteCharAt(current.length() - 1);
        }


    }
}