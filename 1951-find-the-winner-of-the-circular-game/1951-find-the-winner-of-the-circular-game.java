class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        while (que.size() > 1) {
            for (int count = 1; count <= k - 1; count++) {
                que.add(que.poll());
            }
            que.poll();
        }

        return que.peek();
    }
}