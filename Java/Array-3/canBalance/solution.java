public boolean canBalance(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    for (int num : nums) {
        rightSum += num;
    }
    for (int num : nums) {
        leftSum += num;
        rightSum -= num;
        if (leftSum == rightSum) {
            return true;
        }
    } 
    return false;
}