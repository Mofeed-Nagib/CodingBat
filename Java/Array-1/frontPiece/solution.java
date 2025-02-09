public int[] frontPiece(int[] nums) {
    if (nums.length > 1) {
        return new int[] {nums[0], nums[1]};
    }
    else {
        return nums;
    }
}