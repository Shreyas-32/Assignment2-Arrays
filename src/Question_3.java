import java.util.HashMap;

class Solution2 {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();


        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int longestSubsequence = 0;


        for (int num : freqMap.keySet()) {
            if (freqMap.containsKey(num + 1)) {
                int subsequenceLength = freqMap.get(num) + freqMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, subsequenceLength);
            }
        }

        return longestSubsequence;
    }
}



public class Question_3
{
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Solution2 solution = new Solution2();
        int longestSubsequenceLength = solution.findLHS(nums);
        System.out.println("Length of longest harmonious subsequence: " + longestSubsequenceLength);
    }

}
