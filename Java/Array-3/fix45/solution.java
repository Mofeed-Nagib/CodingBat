public int[] fix45(int[] nums) {
    int i = 0, j = 0;
    while (i < nums.length - 1) {
        if (nums[i] == 4 && nums[i + 1] != 5) {
            while (nums[j] != 5 || j > 0 && nums[j - 1] == 4) {
                j++;
            }
            nums[j] = nums[i + 1];
            nums[i + 1] = 5;
            j++;
        }
        i++;
    }
    return nums;
}