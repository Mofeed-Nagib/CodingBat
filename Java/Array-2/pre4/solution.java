public int[] pre4(int[] nums) {
    int len = 0;
    while (nums[len] != 4) {
        len++;
    }
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
        array[i] = nums[i];
    }
    return array;
}