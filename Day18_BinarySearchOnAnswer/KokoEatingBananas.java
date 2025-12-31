import java.util.*;

public class KokoEatingBananas {

    static class Solution {
        public int minEatingSpeed(int[] piles, int h) {

            int min = 1;
            int max = 0;

            for (int pile : piles) {
                max = Math.max(max, pile);
            }

            int ans = max;

            while (min <= max) {
                int mid = min + (max - min) / 2;

                if (canEat(piles, mid, h)) {
                    ans = mid;
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
            return ans;
        }

        private boolean canEat(int[] piles, int k, int h) {
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + k - 1) / k; 
            }
            return hours <= h;
        }
    }

    // For local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(sol.minEatingSpeed(piles, h)); 
    }
}
