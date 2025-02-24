public boolean groupSumClump(int start, int[] nums, int target) {
    if (start == nums.length) {
        return target == 0;
    }
    int count = start + 1;
    while (count < nums.length && nums[count] == nums[start]) {
        count++;
    }
    return groupSumClump(count, nums, target - nums[start] * (count - start)) || groupSumClump(count, nums, target);
}