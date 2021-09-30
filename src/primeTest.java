public class primeTest {
    public static void main(String args[]) {
        int m = 0, flag = 0;
        int n = 10;
        for (int i = 0; i <= n; i++) {
            m = i / 2;
            for (int j = 2; j <= m; j++) {
                if (i % j == 0) {
                    // System.out.println(j);
                    flag = 1;
                    // break;
                }
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}
