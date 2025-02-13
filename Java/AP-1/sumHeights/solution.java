public int sumHeights(int[] heights, int start, int end) {
    int diff = 0;
    for (int i = start; i < end; i++) {
        diff += Math.abs(heights[i] - heights[i + 1]);
    }
    return diff;
}