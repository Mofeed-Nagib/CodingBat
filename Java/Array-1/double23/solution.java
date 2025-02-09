public boolean double23(int[] nums) {
    return nums.length > 1 ? nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3) : false;
}