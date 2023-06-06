class Solution3 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Count of remaining flowers to be planted

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot and its adjacent plots are empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower in the current plot
                count++; // Increment the count of planted flowers

                // If all required flowers have been planted, return true
                if (count == n) {
                    return true;
                }
            }
        }

        return false; // Unable to plant all required flowers
    }
}
public class Question_4
{
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Solution3 solution = new Solution3();
        boolean canPlantFlowers = solution.canPlaceFlowers(flowerbed, n);
        System.out.println("Can plant flowers: " + canPlantFlowers);
    }

}
