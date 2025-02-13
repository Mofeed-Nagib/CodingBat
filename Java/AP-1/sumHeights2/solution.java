public int sumHeights2(int[] heights, int start, int end) {
    int diff = 0;
    for (int i = start; i < end; i++) {
        if (heights[i + 1] > heights[i]) {
            diff += 2 * (heights[i + 1] - heights[i]);
        }
        else {
            diff += heights[i] - heights[i + 1];
        }
    }
    return diff;
}