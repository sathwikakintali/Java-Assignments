import java.util.TreeSet;

public class RemoeElementsCondition {
    public static TreeSet<Integer> removeElementsBelowThreshold(TreeSet<Integer> treeSet, int threshold) {
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer element : treeSet) {
            if (element >= threshold) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeSet<Integer> inputSet = new TreeSet<>();
        inputSet.add(1);
        inputSet.add(2);
        inputSet.add(3);
        inputSet.add(4);
        inputSet.add(5);

        int threshold = 3;
        TreeSet<Integer> outputSet = removeElementsBelowThreshold(inputSet, threshold);

        System.out.println("Output: " + outputSet);
    }
}
