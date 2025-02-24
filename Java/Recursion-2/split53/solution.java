public boolean split53(int[] nums) {
    return split53Helper(0, 0, 0, nums);
}

public boolean split53Helper(int start, int sum1, int sum2, int[] nums) {
    if (start == nums.length) {
        return sum1 == sum2;
    }
    else if (nums[start] % 5 == 0) {
        return split53Helper(start + 1, sum1 + nums[start], sum2, nums);
    }
    else if (nums[start] % 3 == 0) {
        return split53Helper(start + 1, sum1, sum2 + nums[start], nums);
    }
    else {
        return split53Helper(start + 1, sum1 + nums[start], sum2, nums) || split53Helper(start + 1, sum1, sum2 + nums[start], nums);
    }
}