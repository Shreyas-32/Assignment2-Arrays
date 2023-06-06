import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        int maxCandies = candyType.length / 2;


        HashSet<Integer> uniqueCandies = new HashSet<>();


        for (int candy : candyType) {
            uniqueCandies.add(candy);


            if (uniqueCandies.size() == maxCandies) {
                break;
            }
        }


        return uniqueCandies.size();
    }
}




public class Question_2
{
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Solution solution = new Solution();
        int maxCandies = solution.distributeCandies(candyType);
        System.out.println("Max number of different candies: " + maxCandies);
    }
}
