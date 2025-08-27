import java.util.Scanner;
import java.util.Arrays;
public class FirstandLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        int[] idx = searchRange(arr, target);
        System.out.println("Target present at indices: " + Arrays.toString(idx));
        sc.close();
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = firstOccurrence(arr, target);
        ans[1] = lastOccurrence(arr, target);
        return ans;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                res = mid;
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                res = mid;
                s = mid + 1; 
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }
}