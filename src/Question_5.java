import java.util.Arrays;

class Solution5 {
    public int maximumProduct(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Calculate the maximum product
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // Three largest positive numbers
        int product2 = nums[0] * nums[1] * nums[n - 1]; // Two smallest negative numbers and the largest positive number

        // Return the maximum product
        return Math.max(product1, product2);
    }
}

public class Question_5
{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution5 solution = new Solution5();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }

}
