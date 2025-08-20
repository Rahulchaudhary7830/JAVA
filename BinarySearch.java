import java.util.*;
public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n= sc.nextInt();
    System.out.println("Enter array elements");
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();    
    }
    System.out.println("Enter target value");
    int target = sc.nextInt();
    int idx = search(arr, target);
    System.out.println(" target present at index: "+idx);
    sc.close();
  }
  public static int search(int[] arr, int target){
    int left=0;
    int right = arr.length-1;
    while(left <= right){
      int mid = left +(right-left)/2;
      if(arr[mid]==target){
        return mid;
      }
      else if(arr[mid]<target){
        left = mid+1;
      }
      else{
        right =  mid-1;
      }
    }
    return -1;
  } 
}