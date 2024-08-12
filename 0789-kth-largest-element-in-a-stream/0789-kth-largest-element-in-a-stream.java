class KthLargest {
    PriorityQueue<Integer> st;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        st = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        if (st.size() < k) {
            st.offer(val);
        } else if (st.peek() < val) {
            st.poll();
            st.offer(val);
        }
        return st.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
