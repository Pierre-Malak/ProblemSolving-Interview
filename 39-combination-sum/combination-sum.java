class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtrack(candidates,target,0,currentList,result);
        return result;
    }

    void backtrack(int[] candidates, int target, int index, List<Integer> currentList, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(currentList));
            return;
        }
        for(int i = index; i < candidates.length ; i++){
            if(target >= candidates[i]){
                int newTarget = target - candidates[i];
                currentList.add(candidates[i]);
                backtrack(candidates,newTarget,i,currentList,result);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}