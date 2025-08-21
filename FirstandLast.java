import java.util.Scanner;
public class FirstandLast {
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
    int [] idx = searchRange(arr,target);
    for(int i=0;i<idx.length;i++){
    System.out.println(" target present at index: "+idx[i]);}
    sc.close();
    }
    public static int[] searchRange(int[] arr, int target) {
        int s=0;
        int e=arr  .length-1;
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        s=0;
        e=arr.length-1;
        while(s<=e){
            int mid =(s+e)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                s=mid+1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }    
}