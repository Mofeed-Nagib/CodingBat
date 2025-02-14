public int[] post4(int[] nums) {
    int len = nums.length - 1;
    while (nums[len] != 4) {
        len--;
    }
    int[] array = new int[nums.length - 1 - len];
    for (int i = 0; i < array.length; i++) {
        array[i] = nums[len + 1 + i];
    }
    return array;
}