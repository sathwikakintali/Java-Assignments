import java.util.*;

public class IntersectionOfArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Count frequencies in nums1
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check intersection with nums2
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersection.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        // Convert list to array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfArrays solution = new IntersectionOfArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
