class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sumOfRolls = 0;
        
        for (int roll : rolls) {
            sumOfRolls += roll;
        }
        
        int totalSum = mean * (m + n);
        int missingSum = totalSum - sumOfRolls;
        
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }
        
        int[] result = new int[n];
        int baseValue = missingSum / n;
        int remaining = missingSum % n;
        
        for (int i = 0; i < n; i++) {
            if (i < remaining) {
                result[i] = baseValue + 1;
            } else {
                result[i] = baseValue;
            }
        }
        
        return result;
    }
}
