public boolean isEverywhere(int[] nums, int val) {
    for (int i = 1; i < nums.length; i++) {
        if (nums[i - 1] != val && nums[i] != val) {
            return false;
        }
    }
    return true;
}