package pdpuz;

import java.util.Arrays;

public class Solution_747 {
    public static void main(String[] args) {
        Solution_747 solution747 = new Solution_747();

        int[] nums = {3, 6, 1, 0};
        System.out.println(solution747.dominantIndex(nums));


    }

    public int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt(),
                res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                res = i;
                continue;
            }
            if (nums[i] * 2 > max) return -1;
        }
        return res;

    }
}
