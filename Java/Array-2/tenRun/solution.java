public int[] tenRun(int[] nums) {
    int seen = -1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) {
            seen = nums[i];
        }
        else if (seen != -1) {
            nums[i] = seen;
        }
    }
    return nums;
}