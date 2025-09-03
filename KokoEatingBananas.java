import java.util.*;
public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] piles = new int[n];
        for (int i = 0; i < piles.length; i++) {
            piles[i] = sc.nextInt();
        } 
        System.out.println("Enter time");
        int h = sc.nextInt();
        System.out.println(minEatingSpeed(piles, h));
        sc.close();
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maximum(piles);
        while (low <= high) {
            int mid = (low + high) / 2;
            long totalTime = totalHours(piles, mid);
            if (totalTime <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static int maximum(int[] piles) {
        int maxValue = 0;
        for (int pile : piles) {
            maxValue = Math.max(maxValue, pile);
        }
        return maxValue;
    }
    public static long totalHours(int[] piles, int k) {
        long totalTime = 0;
        for (int pile : piles) {
            totalTime += (pile + k - 1) / k;
        }
        return totalTime;
    }
}