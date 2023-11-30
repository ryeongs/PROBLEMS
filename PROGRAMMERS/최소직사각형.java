class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int maxWidth = Math.max(sizes[i][0], sizes[i][1]);
            int minHeight = Math.min(sizes[i][0], sizes[i][1]);
            
            row = Math.max(row, maxWidth);
            col = Math.max(col, minHeight);
        }
        return row*col;
    }
}
