class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> maxFreq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        int[] result = new int[k];
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int key : freq.keySet()){
            maxFreq.add(key);
        }
        for(int i = 0; i<k; i++){
            result[i] = maxFreq.poll();
        }
        return result;
    }
}
