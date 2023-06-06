import java.util.Arrays;

class Solution1 {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;


        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
public class Question_1 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        Solution1 solution = new Solution1();
        int maxSum = solution.arrayPairSum(nums);
        System.out.println("Maximized sum: " + maxSum);
    }
}
