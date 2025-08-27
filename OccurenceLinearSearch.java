import java.util.Scanner;
public class OccurenceLinearSearch{
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
        int count = countOccurences(arr, target);
        if (count > 0) {
            System.out.println(target + " found " + count + " times in the array.");
        } else {
            System.out.println(target + " not found in the array.");
        }
        sc.close();
    }
    public static int countOccurences(int[]arr, int target){
      int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            count++;
        }
    return count;
    }
}