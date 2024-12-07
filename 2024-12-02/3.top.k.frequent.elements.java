/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
*/

import java.util.HashMap;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integar, Integar> frequencyMap = new HashMap<>();
        for (int =num:
        nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integar> minHeap = new PriorityQueue<>(
                (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );

        for (int key : frequencyMap.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}