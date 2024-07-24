import java.util.*;
public class PowerOfTwoTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("N must be between 0 and 30.");
            return;
        }

        for (int i = 0; i <= N; i++) {
            int powerOfTwo = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}
