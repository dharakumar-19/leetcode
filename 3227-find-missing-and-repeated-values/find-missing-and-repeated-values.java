class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long sum = 0, sqSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                sum += num;
                sqSum += (long) num * num;
            }
        }

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long diff = sum - expectedSum; // y - x
        long sqDiff = sqSum - expectedSqSum; // y² - x²

        long sumYX = sqDiff / diff; // y + x

        int y = (int) ((diff + sumYX) / 2); // repeated
        int x = (int) (sumYX - y); // missing

        return new int[]{y, x};
    }
}