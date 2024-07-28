import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        // Reverse the ArrayList
        int start = 0;
        int end = arrList.size() - 1;
        while (start < end) {
            int temp = arrList.get(start);
            arrList.set(start, arrList.get(end));
            arrList.set(end, temp);
            start++;
            end--;
        }

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList:");
        for (int num : arrList) {
            System.out.print(num + " ");
        }
    }
}
