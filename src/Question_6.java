class Solution6 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half of the interval
            } else {
                right = mid - 1; // Target is in the left half of the interval
            }
        }

        return -1; // Target not found
    }
}
public class Question_6
{
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution6 solution = new Solution6();
        int index = solution.search(nums, target);
        System.out.println("Index of target: " + index);
    }

}
