public int[] copyEndy(int[] nums, int count) {
    int[] array = new int[count];
    for (int i = 0, j = 0; j < count; i++) {
        if (isEndy(nums[i])) {
            array[j] = nums[i];
            j++;
        }
    }
    return array;
}

public boolean isEndy(int n) {
    return 0 <= n && n <= 10 || 90 <= n && n <= 100;
}