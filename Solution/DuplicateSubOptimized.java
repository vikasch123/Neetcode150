package Solution;

public class DuplicateSubOptimized {
    // sub optimal approach using sorting : o(nlogn)

    public static boolean containsDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
}
