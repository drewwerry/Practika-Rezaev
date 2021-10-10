package PR_5;

public class Ex7 {
    public Ex7() {
    }

    private static int recursion(int n, int a) {
        if (n > 1) {
            if (n % a == 0) {
                System.out.println(a);
                return recursion(n, a + 1);
            }

            if (n % a != 0 && a < n) {
                return recursion(n, a + 1);
            }

            if (n == a) {
                System.out.println(n);
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        recursion(325, 2);
    }
}