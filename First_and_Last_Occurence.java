import java.util.*;
public class First_and_Last_Occurence {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter elements of array:");
      for (int i= 0;i<n;i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter target value:");
      int target = sc.nextInt();
      findFirst(arr, target, 0);
      findLast(arr, target, arr.length - 1);
      sc.close();
  }
  public static void findFirst(int[] arr, int target, int index) {
      if (index == arr.length) {    
        return;
      }
      if (arr[index] == target) {
        System.out.println("First occurrence: " + index);
        return;
      }
      findFirst(arr, target, index + 1); 
  }
  public static void findLast(int[] arr, int target, int index) {
      if (index < 0) {
        return;
      }
      if (arr[index] == target) {
        System.out.println("Last occurrence: " + index);
        return;
      }
      findLast(arr, target, index - 1);
  }
}