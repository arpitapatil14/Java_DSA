class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtracking(0, target, res, new ArrayList<>(), candidates);
        return res;
    }
    public void backtracking(int index, int target, List<List<Integer>> res, List<Integer> sol, int[] nums) {
        if (target == 0) {
            res.add(new ArrayList<>(sol));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            sol.add(nums[i]);
            backtracking(i + 1, target - nums[i], res, sol, nums);
            sol.remove(sol.size() - 1);
        }
    }
}
