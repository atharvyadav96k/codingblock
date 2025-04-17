class Solution {
    static List<List<Integer>> result;
    static void find(List<Integer> ans, int[] nums, int p){
        if(p == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
                find(ans, nums, p+1);
                ans.remove(ans.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        find(new ArrayList<>(), nums, 0);
        return result;
    }
}