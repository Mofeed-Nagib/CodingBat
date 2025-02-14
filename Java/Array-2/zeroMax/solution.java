public int[] zeroMax(int[] nums) {
    int max = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] % 2 == 1) {
            max = Math.max(max, nums[i]);
        }
        else if (nums[i] == 0) {
            nums[i] = max;
        }
    }
    return nums;
}