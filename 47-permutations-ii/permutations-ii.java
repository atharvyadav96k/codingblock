class Solution {
    List<List<Integer>> result;
    void find(List<Integer> l, int point, int[] nums, boolean used[]){
        if(point == nums.length){
            if(!result.contains(l)){
                result.add(new ArrayList(l));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                l.add(nums[i]);
                find(l,point+1,nums, used);
                l.remove(l.size() - 1);
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        find(new ArrayList<>(), 0, nums, new boolean[nums.length]);
        return result;
    }
}