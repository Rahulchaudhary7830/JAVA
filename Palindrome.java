import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
          int digit =num%10;
          sum=sum*10+digit;
          num=num/10;   
        }
        if(sum==temp){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
        sc.close();
    }
}
