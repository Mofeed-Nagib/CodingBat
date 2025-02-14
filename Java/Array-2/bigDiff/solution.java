public int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        max = Math.max(max, nums[i]);
        min = Math.min(min, nums[i]);
    }
    return max - min;
}