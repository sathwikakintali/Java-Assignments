import java.util.*;
public class Perfectnumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
           if(n%i == 0)
           {
               sum += i;
           }
        }
        if(sum == n)
        {
            System.out.println("its a perfect number!");
        }
        else {
            System.out.println("not a perfect number");
        }
    }
}
