package pdpuz.solutionDataStructurePDP;

public class Solution896 {
    public static void main(String[] args) {
        int[] nums = {5,3,2,4,1};
        System.out.println(isMonotonic(nums));


    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return false;
        int left = nums[0];//5
        int temp = nums[1];//3
        int right = nums[2];//2
        int kam = right;
        int inc=0;
        int i = 2;
        while (i < nums.length) {
            if (left <= temp && temp <= right && inc < right) {
                inc=right;
                left = temp;
                temp = right;
                right = nums[i++];
            } else if (left >= temp && temp >= right && kam > right) {
                kam = right;
                left = temp;
                temp = right;
                right = nums[i++];
            } else return false;

            i++;
        }
        return true;

    }
}
