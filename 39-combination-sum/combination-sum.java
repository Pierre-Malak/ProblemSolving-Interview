class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        backtrack(candidates,target,0,result,currentList);

        return result;
    }

    void backtrack(int[] candidates, int target, int index, List<List<Integer>> result,List<Integer> currentList){
        if(target == 0){
            result.add(new ArrayList<>(currentList));
            return;
        }

        for(int i = index; i< candidates.length;i++){
            if(candidates[i]<=target){
                currentList.add(candidates[i]);
                int newTarget = target - candidates[i];
                backtrack(candidates,newTarget,i,result,currentList);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}