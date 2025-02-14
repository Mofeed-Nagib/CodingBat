public int sum67(int[] nums) {
    int sum = 0;
    boolean seen6 = false;
    for (int num : nums) {
        if (num == 6) {
            seen6 = true;
        }
        else if (!seen6) {
            sum += num;
        }
        else if (num == 7) {
            seen6 = false;
        }
    }
    return sum;
}