import java.util.Arrays;

public class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] res = new int[R * C][2];
        res[0][0] = r0;
        res[0][1] = c0;
        int l = 1;
        int d = 0;
        int i = 1;
        int r = r0, c = c0;
        while (i < R * C) {
            for (int j = 0; j < l; j++) {
                r += direction[d][0];
                c += direction[d][1];
                if (r < R && r >= 0 && c < C && c >= 0) {
                    res[i][0] = r;
                    res[i][1] = c;
                    i++;
                    if (i == R * C) {
                        return res;
                    }
                }
            }
            l += (d % 2);
            d = (d + 1) % 4;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] res=solution.spiralMatrixIII(5,6,1,4);
        System.out.println(Arrays.deepToString(res));
    }
}
