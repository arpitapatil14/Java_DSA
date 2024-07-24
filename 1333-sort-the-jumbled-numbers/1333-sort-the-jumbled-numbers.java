class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int num : nums) {
            int mappedValue = getMappedValue(num, mapping);
            map.computeIfAbsent(mappedValue, k -> new ArrayList<>()).add(num);
        }
        int[] result = new int[nums.length];
        int index = 0;
        for (List<Integer> list : map.values()) {
            for (int num : list) {
                result[index++] = num;
            }
        }
        return result;
    }
    public int getMappedValue(int num, int[] mapping) {
        if (num == 0) {
            return mapping[0];
        }
        int mappedValue = 0;
        int place = 1;
        while (num > 0) {
            int digit = num % 10;
            mappedValue += mapping[digit] * place;
            place *= 10;
            num /= 10;
        }
        return mappedValue;
    }
}

