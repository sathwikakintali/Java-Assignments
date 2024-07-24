import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        int numFlips = 100;

        if (numFlips <= 0) {
            System.out.println("Number of flips must be a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();
        for (int i = 0; i < numFlips; i++) {

            double randomValue = random.nextDouble();


            if (randomValue < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }


        int totalFlips = headsCount + tailsCount;
        double headsPercentage = (headsCount * 100.0) / totalFlips;
        double tailsPercentage = (tailsCount * 100.0) / totalFlips;

        System.out.printf("Heads: %.2f%% | Tails: %.2f%%\n", headsPercentage, tailsPercentage);
    }
}
