import java.util.ArrayList;

public class FindMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(8);
        arrList.add(32);
        arrList.add(21);
        arrList.add(31);

        int min = arrList.get(0);
        int max = arrList.get(0);
        int n = arrList.size();

        for (int i = 1; i < n; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }

        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }
}
