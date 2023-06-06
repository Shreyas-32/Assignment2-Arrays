class Solution8 {
    public int smallestRangeI(int[] nums, int k) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        // Find the maximum and minimum elements in nums
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        // Adjust the maximum and minimum elements
        maxNum = Math.max(maxNum - k, minNum + k);
        minNum = Math.min(minNum + k, maxNum - k);

        // Calculate the final score
        int score = maxNum - minNum;

        return Math.max(score, 0);
    }
}
public class Question_8
{
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Solution8 solution = new Solution8();
        int minScore = solution.smallestRangeI(nums, k);
        System.out.println("Minimum score: " + minScore);
    }

}
