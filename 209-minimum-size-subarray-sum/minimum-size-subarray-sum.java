class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int windowSum = 0;

        for ( int right =0;right<nums.length;right++){
            windowSum += nums[right];

            while(windowSum >= target){
                minLength = Math.min(minLength, right - left +1);
                windowSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}