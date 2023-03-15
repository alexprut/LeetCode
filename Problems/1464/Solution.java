class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->-a.compareTo(b));
        for (int i = 0 ; i < nums.length; i++) { queue.add(nums[i]); }
        return (queue.poll() - 1) * (queue.poll() - 1);
    }
}