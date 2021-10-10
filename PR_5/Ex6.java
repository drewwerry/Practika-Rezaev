package PR_5;

public class Ex6 {
    public Ex6() {
    }
    private static int recursion(int n, int a) {
        if (n > 1) {
            if (n % a != 0) {
                return recursion(n, a + 1);
            }

            if (n % a == 0) {
                if (a == n) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        recursion(124, 2);
    }
}