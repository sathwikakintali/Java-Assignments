import java.util.ArrayList;

public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        int k = 2; // Example value for rotation

        // Calculate effective rotation value
        k %= arrList.size();

        // Reverse the entire ArrayList
        reverse(arrList, 0, arrList.size() - 1);

        // Reverse the first k elements
        reverse(arrList, 0, k - 1);

        // Reverse the remaining elements
        reverse(arrList, k, arrList.size() - 1);

        // Print the rotated ArrayList
        System.out.println("Rotated ArrayList:");
        for (int num : arrList) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
