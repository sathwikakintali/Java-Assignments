import java.util.*;
public class LinearString {
    public static int linearString(String[] arr,String target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(target))
                {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            String[] arr={"a","b","c","ab","bc","ca","abc"};
            System.out.println("enter target string:");
            Scanner sc = new Scanner(System.in);
            String target = sc.nextLine();
            int result = linearString(arr,target);
            if(result == -1)
            {
                System.out.println("target String is not  present in array");
            }
            else {
                System.out.println("target String is present in array at:"+result);
            }
        }
    }

