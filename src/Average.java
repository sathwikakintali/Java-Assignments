import java.util.*;
public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int average;
        for(int i=0;i<=5;i++)
        {
            System.out.println("enter the   "+i+"  number:");
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();
            sum += n;
        }
        average = sum/5 ;
        System.out.println("the average is:"+average);
    }
}
