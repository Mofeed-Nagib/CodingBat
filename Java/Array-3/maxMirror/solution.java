public int maxMirror(int[] nums) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
            if (nums[i + count] == nums[j]) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
    }
    return Math.max(max, count);
}