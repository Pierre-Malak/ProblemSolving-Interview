class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int [] answer = new int[arrayLength];

        answer[0] = 1 ;
        for ( int i =1; i<arrayLength ; i++){
            answer[i]= answer[i-1] * nums[i-1];
        }

        int suffix = 1;
        for ( int i = arrayLength -1 ; i>=0;i--){
            answer[i]= answer[i] * suffix;
            suffix *= nums[i];
        }
        return answer;
    }

}