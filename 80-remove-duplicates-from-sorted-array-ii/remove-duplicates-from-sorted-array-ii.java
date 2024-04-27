class Solution {
    public int removeDuplicates(int[] nums) {
                if (nums.length <= 2) {
            return nums.length; // No need to remove duplicates
        }

        int slow = 2; // Start from the third element
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
    }
