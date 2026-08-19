class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n?0:heights[i]);
            while(!st.isEmpty() && h<heights[st.peek()]){
                int he = heights[st.pop()];
                int we = (st.isEmpty()?i:i-st.peek()-1);
                max = Math.max(he*we,max);
            }
            st.push(i);
        }

        return max;
    }
}
