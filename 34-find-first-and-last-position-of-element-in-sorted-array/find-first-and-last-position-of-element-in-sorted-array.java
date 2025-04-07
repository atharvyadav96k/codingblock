class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        left = idx;
        right = idx;
        int ans[] = {-1, -1};
        if(idx == -1) return ans;
        while(left >= 0 && nums[left] == target){
            ans[0] = left;
            left--;
        }
        while(right < nums.length && nums[right] == target){
            ans[1] = right;
            right++;
        }
        return ans;
    }
}