public int centeredAverage(int[] nums) {
    int sum = nums[0];
    int max = nums[0];
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
        sum += nums[i];
        max = Math.max(max, nums[i]);
        min = Math.min(min, nums[i]);
    }
    return (sum - max - min) / (nums.length - 2);
}