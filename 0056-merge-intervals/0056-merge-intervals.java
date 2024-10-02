class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] ans = new int[n][2];
        int idx = 0;
        ans[idx] = intervals[0];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= ans[idx][1]) {
                ans[idx][1] = Math.max(ans[idx][1], intervals[i][1]);
            } else {
                idx++;
                ans[idx] = intervals[i];
            }
        }
        return Arrays.copyOf(ans, idx + 1);
    }
}
