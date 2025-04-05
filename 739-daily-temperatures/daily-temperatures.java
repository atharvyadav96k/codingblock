class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                int idx = s.pop();
                ans[idx] = i - idx; 
            }
            s.push(i);
        }
        return ans;
    }
}