public class _70 {
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int res = 1;
        for (int i = 0; i < n; i++) {
            q = p;
            p = res;
            res = p + q;
        }
        return res;
    }
}
