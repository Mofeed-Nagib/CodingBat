# Array-2 > tenRun

For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

- tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
- tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
- tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]