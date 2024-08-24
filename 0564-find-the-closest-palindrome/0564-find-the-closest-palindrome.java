class Solution {
    public String nearestPalindromic(String n) {
        long number = Long.parseLong(n);
        if (number <= 10) return String.valueOf(number - 1);
        if (number == 11) return "9";
        int length = n.length();
        long leftHalf = Long.parseLong(n.substring(0, (length + 1) / 2));        
        long[] palinArray = new long[5];
        palinArray[0] = getPalin(leftHalf - 1, length % 2 == 0);
        palinArray[1] = getPalin(leftHalf, length % 2 == 0);
        palinArray[2] = getPalin(leftHalf + 1, length % 2 == 0);
        palinArray[3] = (long)Math.pow(10, length - 1) - 1;
        palinArray[4] = (long)Math.pow(10, length) + 1;
        long closetPalin = 0;
        long minDiff = Long.MAX_VALUE;
        for (long candidate : palinArray) {
            if (candidate == number) continue;
            long difference = Math.abs(candidate - number);
            if (difference < minDiff || (difference == minDiff && candidate < closetPalin)) {
                minDiff = difference;
                closetPalin = candidate;
            }
        }

        return String.valueOf(closetPalin);
    }

    private long getPalin(long leftHalf, boolean isEvenLength) {
        long palindrome = leftHalf;
        if (!isEvenLength) leftHalf /= 10;
        while (leftHalf > 0) {
            palindrome = palindrome * 10 + leftHalf % 10;
            leftHalf /= 10;
        }
        return palindrome;
    }
}