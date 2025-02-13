public int[] copyEvens(int[] nums, int count) {
    int[] array = new int[count];
    for (int i = 0, j = 0; j < count; i++) {
        if (nums[i] % 2 == 0) {
            array[j] = nums[i];
            j++;
        }
    }
    return array;
}