public boolean either24(int[] nums) {
    boolean seen22 = false;
    boolean seen44 = false;
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 2) {
            seen22 = true;
        }
        if (nums[i] == 4 && nums[i + 1] == 4) {
            seen44 = true;
        }
    }
    return seen22 != seen44;
}