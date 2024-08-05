import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // Count the frequency for each element
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a min heap (priority queue)
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

        // Maintain a heap of size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // Get all elements from the heap
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().getKey());
        }

        // Reverse the order to get the most frequent elements first
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = solution.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + result);
    }
}
