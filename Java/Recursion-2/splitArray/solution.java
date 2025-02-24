public boolean splitArray(int[] nums) {
    return splitArrayHelper(0, 0, 0, nums);
}

public boolean splitArrayHelper(int start, int sum1, int sum2, int[] nums) {
    if (start == nums.length) {
        return sum1 == sum2;
    }
    return splitArrayHelper(start + 1, sum1 + nums[start], sum2, nums) || splitArrayHelper(start + 1, sum1, sum2 + nums[start], nums);
}