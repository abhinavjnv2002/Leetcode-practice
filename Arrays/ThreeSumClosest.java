import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) > Math.abs(target - currSum)) {
                    sum = currSum;
                }
                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else { 
                    return currSum;
                }
            }
        }
        return sum;
    }
}
