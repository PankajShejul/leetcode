class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = lowerBound(nums, target);
        int r = lowerBound(nums, target + 1);
        return (l == r) ? new int[]{-1, -1} : new int[]{l, r - 1};
    }

    private int lowerBound(int[] nums, int x) {
         int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}