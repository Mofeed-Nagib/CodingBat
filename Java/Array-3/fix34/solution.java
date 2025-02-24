public int[] fix34(int[] nums) {
    int i = 0, j = 1;
    while (i < nums.length - 1) {
        if (nums[i] == 3 && nums[i + 1] != 4) {
            while (nums[j] != 4 || nums[j - 1] == 3) {
                j++;
            }
            nums[j] = nums[i + 1];
            nums[i + 1] = 4;
            j++;
        }
        i++;
    }
    return nums;
}