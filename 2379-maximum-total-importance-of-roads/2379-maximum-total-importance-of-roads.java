class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        for (int[] road : roads) { //deg of each node
            int u = road[0];
            int v = road[1];

            degree[u]++;
            degree[v]++;
        }
        Arrays.sort(degree);

        long value = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (degree[i] * value);
            value++;
        }

        return sum;
    }
}