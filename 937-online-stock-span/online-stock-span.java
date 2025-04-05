class StockSpanner {
    Stack<int[]> s = new Stack<>();
    public int next(int price) {
        int day = 1;
        while(!s.isEmpty() && s.peek()[0] <= price){
            day = day + s.pop()[1];
        }
        int val[] = {price, day};
        s.push(val);
        return day;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */