class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i : nums){
            l.add(i);
        }
        int count = 0;
        while(!isSorted(l)){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int i=0;i<l.size()-1;i++){
                if(l.get(i) + l.get(i+1)<min){
                    min = l.get(i) + l.get(i+1);
                    idx = i;
                }
            }
            ArrayList<Integer> ll = new ArrayList<>();
            for (int i = 0; i <l.size(); i++) {
                if (i == idx) {
                    ll.add(min); 
                    count++;
                    i++;
                } else {
                    ll.add(l.get(i));
                }
            }
            l = ll;
        }
        return count;
    }
    boolean isSorted(ArrayList<Integer> l){
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i) > l.get(i+1)) return false;
        }
        return true;
    }
}