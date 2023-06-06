class Solution7 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false; // Not strictly increasing
            }

            if (nums[i] > nums[i - 1]) {
                decreasing = false; // Not strictly decreasing
            }
        }

        return increasing || decreasing;
    }
}
public class Question_7
{
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Solution7 solution = new Solution7();
        boolean isMonotonic = solution.isMonotonic(nums);
        System.out.println("Is the array monotonic? " + isMonotonic);
    }

}
