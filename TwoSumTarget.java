import java.util.*;
public class TwoSumTarget {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println("\nEnter target value");
    int target = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("Pair found at indices: " + i + "," + j);
          sc.close();
          return;
        }
      }
    }
    System.out.println("Target not found in array");
    sc.close();
  }
}