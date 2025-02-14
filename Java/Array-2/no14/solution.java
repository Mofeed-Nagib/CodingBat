public boolean no14(int[] nums) {
    boolean seen1 = false;
    boolean seen4 = false;
    for (int num : nums) {
        if (num == 1) {
            seen1 = true;
        }
        if (num == 4) {
            seen4 = true;
        }
    }
    return !seen1 || !seen4;
}