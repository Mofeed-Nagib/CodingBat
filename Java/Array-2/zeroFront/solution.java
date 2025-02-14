public int[] zeroFront(int[] nums) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] == 0) {
            nums[j] = nums[i];
            nums[i] = 0;
            i++;
        }
    }
    return nums;
}