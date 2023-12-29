public class factorialDP {

    int factorialDP(int n) {
        int[] a = new int[n + 1];
        int i, j;
        a[0] = 1;
        for (i = 0; i <= n; i++) {
            a[i] = i * a[i - 1];
        }
        return a[n];
    }

    public static void main(String[] args) {

    }
}
