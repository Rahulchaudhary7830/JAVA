import java.util.Scanner;
public class SearchRotatedArray {
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
      int idx = search(arr, target);
      System.out.println("target present at index: "+idx);
      sc.close();
  }
    public static int search(int[] arr, int target) {
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
