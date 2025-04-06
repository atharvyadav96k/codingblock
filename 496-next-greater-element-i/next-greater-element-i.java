class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek() < nums2[i]){
                int num = s.pop();
                map.put(num, nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
            int num = s.pop();
            map.put(num, -1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}