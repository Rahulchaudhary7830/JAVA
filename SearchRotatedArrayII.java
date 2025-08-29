import java.util.Scanner;
public class SearchRotatedArrayII {
  public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter size of aray");
      int n= sc.nextInt();
      System.out.println("Enter array elements");
      int [] arr=new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
      System.out.println("Enter target element");
      int target= sc.nextInt();
      System.out.println(rotate (arr, target));
      sc.close();
  }
  public static boolean rotate(int[] arr, int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            return true;
        }
    }
    return false;
  }
}