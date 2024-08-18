class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = new int[]{2, 3, 5};
        HashSet<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1L);
        heap.add(1L);
        long currentUgly = 1;
        for (int i = 0; i < n; i++) {
            currentUgly = heap.poll();
            for (int prime : primes) {
                long newUgly = currentUgly * prime;
                if (!seen.contains(newUgly)) {
                    seen.add(newUgly);
                    heap.add(newUgly);
                }
            }
        }
        return (int) currentUgly;
    }
}
