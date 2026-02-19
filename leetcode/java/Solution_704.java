package pdpuz;

public class Solution_704 {
    public static void main(String[] args) {
        Solution_704 solution704 = new Solution_704();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(solution704.search(nums, target));

    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return res;
    }
}
