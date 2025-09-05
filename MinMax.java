import java.util.*;
public class MinMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int min = arr[0];
    int max = arr[arr.length-1];
    System.out.println("minimum element: " + min + "\nmaximum element: "+ max);
    sc.close();
  }
}

