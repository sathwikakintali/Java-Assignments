import java.util.Arrays;
import java.util.Random;

public class Coupon {

    public static int[] generateCouponNumbers(int n) {
        // Generate N distinct coupon numbers
        int[] couponNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            couponNumbers[i] = i + 1;
        }
        return couponNumbers;
    }

    public static int generateDistinctCoupons(int n) {
        // Simulate the process of generating distinct coupons
        int[] distinctCoupons = new int[n];
        boolean[] isCouponGenerated = new boolean[n];
        int totalRandomNumbers = 0;
        Random random = new Random();

        while (true) {
            int randomNumber = random.nextInt(n) + 1;
            totalRandomNumbers++;

            if (!isCouponGenerated[randomNumber - 1]) {
                distinctCoupons[randomNumber - 1] = randomNumber;
                isCouponGenerated[randomNumber - 1] = true;
            }

            boolean allCouponsGenerated = true;
            for (boolean generated : isCouponGenerated) {
                if (!generated) {
                    allCouponsGenerated = false;
                    break;
                }
            }

            if (allCouponsGenerated) {
                break;
            }
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        int N = 10; // Number of distinct coupon numbers
        int[] couponNumbers = generateCouponNumbers(N);
        System.out.println("Generated distinct coupon numbers: " + Arrays.toString(couponNumbers));

        int totalRandomNumbers = generateDistinctCoupons(N);
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);
    }
}
