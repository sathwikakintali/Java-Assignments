import java.util.*;
public class LinearSearch{
public static int linearsearch(int[] arr,int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;}
        }
    return -1;
}
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int target;
        System.out.println("enter target element:");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        int result = linearsearch(arr,target);
        if(result == -1)
        {
            System.out.println("target element is not  present in array");
        }
        else {
            System.out.println("target element is present in array at:"+result);
        }
    }
}
