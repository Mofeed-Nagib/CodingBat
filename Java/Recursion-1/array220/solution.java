public boolean array220(int[] nums, int index) {
    if (nums.length - index < 2) {
        return false;
    }
    else if (nums[index + 1] == 10 * nums[index]) {
        return true;
    }
    return array220(nums, index + 1);
}