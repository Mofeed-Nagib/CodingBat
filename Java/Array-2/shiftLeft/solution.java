public int[] shiftLeft(int[] nums) {
    if (nums.length > 1) {
        int[] array = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            array[i - 1] = nums[i];
        }
        array[nums.length - 1] = nums[0];
        return array;
    }
    else {
        return nums;
    }
}