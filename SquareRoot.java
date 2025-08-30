import java.util.*;
public class SquareRoot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.out.println(root(num));
    sc.close();
  }
  public static int root(int num){
    if(num == 0 || num == 1)
    return num;
    int left=0;
    int right = num;
    int ans=0;
    while(left <= right){
      int mid = left + (right - left)/2;
      if(mid * mid == num){
      return mid;
      }
      else if(mid * mid < num){
        ans=mid;
        left = mid+1;
      }
      else{
        right= mid-1;
      }
    }
    return ans;
  } 
}