import java.util.Scanner;
public class PeakElement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of aray");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("peak element is present at index: "+ peak(arr));
        sc.close();
    }
    public static int peak(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return right;
    }
}