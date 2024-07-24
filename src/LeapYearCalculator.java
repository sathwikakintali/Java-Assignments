public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2024; // Change this to the desired year

        if (year < 1000 || year > 9999) {
            System.out.println("Year must be a 4-digit number.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
