package PR_5;

public class Ex8 {
    public Ex8() {
    }

    private static int recursion(String str, int i, int check) {
        char[] timeChar = str.toCharArray();
        if (i == timeChar.length - 1 && check == 1) {
            System.out.println("YES");
            return 0;
        } else {
            if (timeChar.length > i && timeChar[i] == timeChar[timeChar.length - i - 1]) {
                return recursion(str, i + 1, 1);
            } else {
                System.out.println("NO");
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        recursion("topot", 0, 0);
    }
}