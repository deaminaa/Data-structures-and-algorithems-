import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length * grid.length;

        long actual_sum = 0;
        long actual_sum_square = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                actual_sum += grid[i][j];
                actual_sum_square += (long) grid[i][j] * grid[i][j];
            }
        }

        long expected_sum = (long) n * (n + 1) / 2;
        long expected_sum_square = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff1 = actual_sum - expected_sum;               // R - M
        long diff2 = actual_sum_square - expected_sum_square; // R² - M²

        long sumRM = diff2 / diff1; // R + M

        int repeated = (int) ((diff1 + sumRM) / 2);
        int missing = (int) (repeated - diff1);

        return new int[]{repeated, missing};
    }
}
