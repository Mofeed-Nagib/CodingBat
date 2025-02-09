public int maxTriple(int[] nums) {
    return Math.max(nums[0], Math.max(nums[nums.length - 1], nums[nums.length / 2]));
}