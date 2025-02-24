public int countClumps(int[] nums) {
    boolean seen = false;
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        if (!seen && nums[i] == nums[i + 1]) {
            count++;
            seen = true;
        }
        else if (nums[i] != nums[i + 1]) {
            seen = false;
        }
    }
    return count;
}